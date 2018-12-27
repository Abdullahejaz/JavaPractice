package com.abdullah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private int id;
    private String firstName, lastName;
    List<Employee> listOfEmployee = new ArrayList<>();
    ArrayList<Role> listOfRoles = new ArrayList<>();
    Phone phone = new Phone();
    Address address = new Address();
    Role role = new Role();
    String jobInput;
    JobType jobType;
    Contractor contractor;
    FullTime fullTime;
    Scanner sc = new Scanner(System.in);

    public Employee() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Employee(int id, String firstName, String lastName, ArrayList<Role> role, Phone phone,  Address address, JobType jt ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void add(){

    }

    public Employee addEmployee(){

        System.out.println("Enter the ID of the Employee");
        id = sc.nextInt();
        System.out.println("Enter the first name of the Employee");
        firstName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the last name of the employee");
        lastName = sc.nextLine();

        Phone tempPhone = phone.addPhone();
        Address tempAddress = address.addAddress();

        System.out.println("Enter the number of roles for the employee");
        int count = sc.nextInt();
        for (int i = 0; i<count; i++){
            listOfRoles.add(role.addRole());
        }

        System.out.println("Enter the type of job for the employee. The options are Full Time and Contractor");

        jobInput = sc.nextLine();

        if(jobInput.equalsIgnoreCase("Contractor")){
            jobType = contractor.addContractor();
        }
        else if(jobInput.equalsIgnoreCase("Full Time")){
            jobType = fullTime.addFulltime();
        }



        return new Employee(id, firstName, lastName, listOfRoles, tempPhone, tempAddress, jobType);
    }
}


































