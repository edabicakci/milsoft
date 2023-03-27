package com.godoro.enums;

public class DaysTest {
    private static void printDay(int day){
        switch(day){

            case 1:
            System.out.println("Pazartesi");
            break;

            case 2:
            System.out.println("Salı");
            break;

            case 3:
            System.out.println("Çarşamba");
            break;

            case 4:
            System.out.println("Geçersiz gün");
            break;
        }



    }


    public static void main(String[] args) {
        int day = 27;
        printDay(day);
        
    }
    
}
