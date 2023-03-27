package com.godoro.hws.hw2.partA;

public class Test {
    public static void main(String[] args) {
        
       Person person = new Employee(401, 4567, "Edip", "Akbayram");
       person.setEmailaddress("edip@godoro.com");
       sendEmail(person);
    }

    public static void sendEmail(Person person){

        System.out.println();
        System.out.println("Kime: " + person.getEmailaddress());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName()); 
}
}
