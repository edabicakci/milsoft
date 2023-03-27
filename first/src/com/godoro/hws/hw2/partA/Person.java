package com.godoro.hws.hw2.partA;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    private String emailaddress;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getEmailaddress() {
        return emailaddress;
    }
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }      

    public String getFullName(){
        return firstName + " " + lastName;
    }
    abstract public String getGreeting();
}
