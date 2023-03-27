package com.godoro.statics;

import com.godoro.enums.Day;

public class BankAccount {

    private double investment;
    private static double rate;
    private final static int MONTHS_IN_YEAR= 12;

    public double getAmount(int month){

        return investment *(1 + rate/100)/12;  
    }

    @Secure(value=3, day = Day.MONDAY)
    public double getAmount(){

        return getAmount(MONTHS_IN_YEAR);
    }

    public double getInvestment() {
        return investment;
    }
    public void setInvestment(double investment) {
        this.investment = investment;
    }
    public static double getRate() {
        return rate;
    }
    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }

    
    
}
