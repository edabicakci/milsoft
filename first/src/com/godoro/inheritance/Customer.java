package com.godoro.inheritance;

public class Customer extends Person {
    private long customerId;
    private double totalDebit;


    public Customer(long customerId, double totalDebit, String firstName, String lastName) {
        super(firstName, lastName);
        this.customerId = customerId;
        this.totalDebit = totalDebit;
    }
    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public double getTotalDebit() {
        return totalDebit;
    }
    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }   

    @Override
    public String getFullName(){
        return lastName + " " + firstName;
    }

    @Override   // implemnet ediyo aslında 
    public String getGreeting(){
        return "Merhaba";

    }
}
