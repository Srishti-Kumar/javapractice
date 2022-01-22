package classpracticeJAVA5;


import java.util.Date;

public class bankInheritance {
    static public class bankAccount{

        String AccountNo;
        double balance;
        int bankCode;
    }

    static class checking extends bankAccount{
        double limit;
    }
    static class saving extends bankAccount{
        int transfers;
    }
    static class COD extends bankAccount{
        Date expiry;
    }



    public static void main(String[] args){

        checking customer1 = new checking();
        customer1.AccountNo = "8993322";
        customer1.limit = 999.99;
        customer1.balance = 8888.88;
        customer1.bankCode = 1234;
        System.out.println(customer1.AccountNo);

        saving customer2 = new saving();
        customer2.AccountNo = "330394039049034";
        customer2.transfers = 242424;

        COD customer3 = new COD();
        Date todaysDate = new Date();
        customer3.expiry = todaysDate;
        System.out.println(customer3.expiry);



    }
}
