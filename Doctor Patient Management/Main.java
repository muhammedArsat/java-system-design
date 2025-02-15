import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patientList = new ArrayList<>();
        List<Doctor> doctorList = new ArrayList<>();
        List<Prescription> prescriptionList = new ArrayList<>();
        List<Billing> billList = new ArrayList<>();
        List<AppointmentSchedule> appointmentList = new ArrayList<>();
        List<MedicalRecords> recordsList = new ArrayList<>();

        patientList.add(new Patient(patientList.size()+1, "patient1@gmail.com", "p1", "Patient 1"));
        patientList.add(new Patient(patientList.size()+1, "patient2@gmail.com", "p2", "Patient 2"));

        doctorList.add(new Doctor(doctorList.size()+1, "doctor1@gmail.com", "d1", "doctor 1", "2024-12-12", "Cardiac"));
        doctorList.add(new Doctor(doctorList.size()+1, "doctor2@gmail.com", "d2", "doctor 2", "2024-11-13", "Neurologist"));
        int choice;
        while(true){
            System.out.println("Enter 1 to book Appointment");
            System.out.println("Enter 2 to get prescriptionList");
            System.out.println("Enter 3 to getMedicalRecords");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter Your Details");
                 getPatientDetail(patientList);
                 System.out.println("Enter Which Specialist: ");
                 sc.nextLine();
                 String specialist = sc.nextLine();
                 Doctor requiredDoctor = getDoctorBySpeacialist(doctorList,specialist);
                 if(requiredDoctor == null){
                    System.out.println("Required Specialist Not Available");
                    return;
                 }else{
                    System.out.println("Enter The Appointment Date yyyy-MM-dd");
                    String preferedDate = sc.next();
                    if(requiredDoctor.isDoctorAvailable( preferedDate)){
                        appointmentList.add(new AppointmentSchedule(appointmentList.size()+1, specialist, preferedDate));
                        Prescription.createPrescription(prescriptionList, new Prescription(prescriptionList.size()+1, "Medicine1", 2, 5));
                      Billing currentBill =   Billing.createBill(billList, new Billing(billList.size()+1,2500,new Date()));
                        System.out.println(currentBill);
                        MedicalRecords.createMedicalRecords(recordsList, new MedicalRecords(recordsList.size()+1, specialist, new Date(), currentBill));

                    }else{
                        System.out.println("Sorry Doctor is Not Available");
                        return;
                    }

                 }
                 break;
                 case 3:
                 System.out.println(recordsList);
                 break;







            }
        }
    }


    public static void getPatientDetail(List<Patient> patientList){
        Scanner sc = new Scanner(System.in);
        int id = patientList.size()+1;
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Email");
        String email = sc.next();
        System.out.println("Enter Your Password");
        String Password = sc.next();
        patientList.add(new Patient(id, email, Password, name));

    }

    public static Doctor getDoctorBySpeacialist(List<Doctor> docList,String specialList){
        for(Doctor doc : docList){
            if(doc.getSpecialist().equals(specialList)){
                return doc;
            }
        }
        return null;
    }

}
