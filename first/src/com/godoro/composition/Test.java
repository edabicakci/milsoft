package com.godoro.composition;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Department departmentA = new Department(501, "Muhasebe");
        departmentA.setEmployeeList(new ArrayList<Employee>());  
        
        Employee employee1 = new Employee(601, "Teoman Alpay", 34840);
        employee1.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee1);


        Employee employee2 = new Employee(602, "Yusuf Nalkesen ", 65465);
        employee2.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee2);

        Employee employee3 = new Employee(603, "Yıldırım Gürses ", 34670);
        employee3.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee3);


        System.out.println(departmentA.getDepartmentId() + " " + departmentA.getDepartmentName());

        for (Employee employee : departmentA.getEmployeeList()) {
            System.out.println("\t" + employee.getEmployeeId() + " " + employee.getEmployeeName() + " " 
            + employee.getMonthSalary() + " " 
            + employee.getDepartment().getDepartmentName() + " "
            + employee.getDepartment().getDepartmentId());
            
        }




    }
    
}
