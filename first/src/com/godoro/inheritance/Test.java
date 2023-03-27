package com.godoro.inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(301, 6540, "Cem", "Karaca");
        customer.setEmailAddress("cem@godoro.com");

       // customer.setCustomerId(301);
       // customer.setFirstName("Cem");
       // customer.setLastName("Karaca");
      //  customer.setTotalDebit(6540);

        // Person person = new Person();     // abstract olduğu için hata verir 
        Person person = new Customer(302, 7235, "Barış", "Manço");
        person.setEmailAddress("baris@godoro.com");
        //person.setFirstName("Barış");
        //person.setLastName("Manço");

        if (person instanceof Customer customerPerson){
            //Customer customerPerson = (Customer) person;
            
            //customerPerson.setCustomerId(302);
            //customerPerson.setTotalDebit(7235);
        }

        System.out.println(customer.getFullName());
        System.out.println(person.getFullName());

        Supplier supplier = new Supplier(701, 8795, "Fikret", "Kızılok");
        supplier.setEmailAddress("fikret@godoro.com");
        //supplier.setSupplierId(701);
        //supplier.setFirstName("Fikret");
        //supplier.setLastName("Kızılok");
        //supplier.setTotalCredit(8795);


        //polymorphism
        System.out.println(customer.getGreeting()+ " " + customer.getFullName());
        System.out.println(person.getGreeting()+ " " + person.getFullName());
        System.out.println(supplier.getGreeting() + " " + supplier.getFullName());

        sendMail(customer);
        sendMail(person);
        sendMail(supplier);

    }

    private static void sendMail(Person person){

        System.out.println();
        System.out.println("Kime: " + person.getEmailAddress());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName());
    }
    
}
