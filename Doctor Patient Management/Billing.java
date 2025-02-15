import java.util.*;
public class Billing {

    private int billId;
    private int  billAmount;
    private Date billDate;

    public Billing(int billId, int billAmount, Date billDate){
        this.billId = billId;
        this.billAmount = billAmount;
        this.billDate = billDate;
    }

    public static Billing createBill(List<Billing> billingsList, Billing bill){
        billingsList.add(bill);
        return bill;
    }

    public String toString(){
        return billId+"   "+billAmount+"   "+billDate;
    }

}
