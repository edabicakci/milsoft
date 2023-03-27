package com.godoro.statics;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount.setRate(24);

    BankAccount bankAccount1 = new BankAccount();
    bankAccount1.setInvestment(300);
    BankAccount.setRate(36);
    System.out.println("Tutar 09" + " " + bankAccount1.getAmount(9));
    System.out.println("Tutar 12 " + " " + bankAccount1.getAmount());
    //bankAccount1.setRate(24);

    BankAccount.setRate(36);

    BankAccount bankAccount2 = new BankAccount();
    bankAccount2.setInvestment(300);
    System.out.println("Tutar" + " " + bankAccount2.getAmount(9));
    //bankAccount1.setRate(24);    --> 36 yapsan diğeri de degişir.
   
        
    }



    
}
