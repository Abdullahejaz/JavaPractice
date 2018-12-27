package com.abdullah;

import java.util.Scanner;

public class Role {

    private int id;
    private String name;
    //Check this line of code.
    public Scanner sc = new Scanner(System.in);

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Role addRole(){

        /*System.out.println("Enter the number of roles you want to add for the employee ");
        int count = sc.nextInt();
        for(int i = 0; i<=count; i++){*/
            System.out.println("Please enter the role ID");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter the name of the role");
            name = sc.nextLine();
            sc.nextLine();

        return new Role(id, name);

    }
}
