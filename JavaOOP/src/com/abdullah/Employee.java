package com.abdullah;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String firstName, lastName;
    List<Employee> listOfEmployee = new ArrayList<>();
    Phone phone;
    Address address;

    public Employee() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName, ArrayList<Role> role, Address address, JobType jobType ) {
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

    public void addEmployee(){

    }


}


































