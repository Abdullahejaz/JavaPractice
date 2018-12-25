package com.abdullah;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HRService {

Map<Company , List<Employee>> companyEmpList = new HashMap<>();

Scanner sc = new Scanner(System.in);
Company company = new Company();
Employee employee = new Employee();

public void add(){

    int choice =0;
    System.out.println("Enter your choice to perform a task");
    System.out.println("Enter 1 to Add the details of the company");
    System.out.println("Enter 2 to add an employee to the company");
    System.out.println("Enter 3 to view the records of the employee for the company");
    choice = sc.nextInt();

    switch (choice){
        case 1:
        {
            company.addCompany();
            break;

        }
        case 2:
        {
            employee.addEmployee();
            break;
        }
    }


}

private void addEmployee(){

}

    public static void main(String[] args) {
        HRService services = new HRService();
        services.add();
    }

public static void removeEmployee(){}

public static void searchEmployee(){}


}
