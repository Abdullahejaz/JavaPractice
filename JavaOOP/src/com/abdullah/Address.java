package com.abdullah;

import java.util.Scanner;

public class Address {

    private int id;
    private String zip, country, state, city, line1, line2;
    private Scanner sc = new Scanner(System.in);

    public Address() {
    }

    public Address(int id, String zip, String country, String state, String city, String line1, String line2) {
        this.id = id;
        this.zip = zip;
        this.country = country;
        this.state = state;
        this.city = city;
        this.line1 = line1;
        this.line2 = line2;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Address addAddress(){
        System.out.println("Enter the id for the address");
        id = sc.nextInt();
        System.out.println("Enter the zip code");
        zip = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the name of the country");
        country = sc.nextLine();
        System.out.println("Enter the name of the state");
        state = sc.nextLine();
        System.out.println("Enter the name of the city");
        city = sc.nextLine();
        System.out.println("Enter the address in the first line.");
        line1 = sc.nextLine();
        System.out.println("Enter the address for the second line");
        line2 = sc.nextLine();

        return new Address(id, zip, country, state, city, line1, line2);
    }
}
