package com.abdullah;

import java.util.Scanner;

public class Company {

    private int id;
    private String name;
    private Scanner sc = new Scanner(System.in);
    //List<Employee> employeeList = new ArrayList<>();


    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }*/

    public Company addCompany(){
        System.out.println("Please enter the id of the company");
        id = sc.nextInt();
        System.out.print("Please enter the name of the company");
        name = sc.nextLine();

        return new Company(id, name);
    }
}
