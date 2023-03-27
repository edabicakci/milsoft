package com.godoro.inheritance;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    private String emailAddress;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
      
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getFirstName() {
        return firstName;
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
