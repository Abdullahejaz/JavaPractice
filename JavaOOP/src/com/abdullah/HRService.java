package com.abdullah;

import java.util.*;

public class HRService {

ArrayList<Employee> employeeList = new ArrayList<>();

Scanner sc = new Scanner(System.in);
Company company = new Company();
Employee employee = new Employee();

public void add(){

    while(true) {
        int choice = 0;
        System.out.println("********************************************");
        System.out.println("Enter your choice to perform a task");
        System.out.println("Enter 1 to Add the details of the company");
        System.out.println("Enter 2 to add an employee to the company");
        System.out.println("Enter 3 to view the employee data.");
        System.out.println("Enter 4 to exit the program.");
        System.out.println("********************************************");
        choice = sc.nextInt();

        switch (choice) {
            case 1: {
                company.addCompany();
                break;
            }
            case 2: {
                employeeList.add(employee.addEmployee());
                break;
            }

            case 3: {
                System.out.println(employeeList);
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
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
