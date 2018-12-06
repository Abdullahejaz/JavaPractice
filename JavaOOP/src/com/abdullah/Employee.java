package com.abdullah;

import java.util.Scanner;

public class Employee {

    private int id;
    private String firstName, lastName;

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

    public void addEmployee(){

    }

    public void add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Name");
        id = sc.nextInt();

        System.out.println("Enter the first Name");
        firstName = sc.nextLine();

        System.out.println("Enter the Last Name");
        firstName = sc.nextLine();

    }
}
