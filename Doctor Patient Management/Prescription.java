import java.util.*;
public class Prescription {
    private int prescriptionId;
    private String drugs;
    private int quantity;
    private int dosage;

    public Prescription(int prescriptionId, String drugs, int quantity, int dosage){
        this.prescriptionId = prescriptionId;
        this.drugs = drugs;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public static    void createPrescription(List<Prescription> prescriptionList,Prescription prescription){
        prescriptionList.add(prescription);
    }
}
