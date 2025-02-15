import java.util.*;
public class MedicalRecords {
    private int recordId;
    private String disease;
    private Date checkUpDate;
    private Billing bill;

    public MedicalRecords(int recordId,String disease, Date checkUpDate, Billing bill){
        this.recordId = recordId;
        this.disease = disease;
        this.checkUpDate = checkUpDate;
        this.bill = bill;
    }

    public static void createMedicalRecords(List<MedicalRecords> recordList, MedicalRecords record ){
        recordList.add(record);
    }


    public void getAllRecords(List<MedicalRecords> medicalRecordLists){
        for(MedicalRecords medicalRecord : medicalRecordLists){
            System.out.println(medicalRecord);
        }
    }

    public String toString(){
        return "Record Id is  "+recordId+"the Disease is "+disease+"Check Up Date "+checkUpDate+"Bill Amount"+bill;
    }

}
