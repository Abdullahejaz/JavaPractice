package com.abdullah;

import java.util.Scanner;

public class Phone {

    private int id;
    private String areaCode;
    private String number;
    private String countryCode;

    public Scanner sc = new Scanner(System.in);

    public Phone() {
    }

    public Phone(int id, String areaCode, String number, String countryCode) {
        this.id = id;
        this.areaCode = areaCode;
        this.number = number;
        this.countryCode = countryCode;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Phone addPhone(){
        System.out.println("Enter the id of the phone");
        id = sc.nextInt();
        System.out.println("Enter the Area Coed");
        areaCode = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the phone number");
        number = sc.nextLine();
        System.out.println("Enter the country code for the number");
        countryCode = sc.nextLine();

        return new Phone(id, areaCode, number, countryCode);
    }
}
