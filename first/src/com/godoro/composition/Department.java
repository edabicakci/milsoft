package com.godoro.composition;

import java.util.List;

public class Department {

    private long departmentId;
    private String departmanetName;
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    private List<Employee> employeeList;

    public Department(){

    }

    public Department(long departmentId, String departmanetName) {
        this.departmentId = departmentId;
        this.departmanetName = departmanetName;
    }

    public long getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmanetName;
    }
    public void setDepartmanetName(String departmanetName) {
        this.departmanetName = departmanetName;
    }

    
    
}
