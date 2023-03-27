package com.godoro.hws.hw2.partA;

public class Employee extends Person{

    private long employeeId;
    private double monthlySalary;
 
    public Employee(long employeeId, double monthlySalary, String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
   
    @Override
    public String getGreeting(){
        return "Merhaba";
    }

    @Override
    public String getFullName(){

        return lastName + " " + firstName;
        
    }
    
}
