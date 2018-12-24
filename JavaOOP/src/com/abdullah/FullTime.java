package com.abdullah;

import java.util.Scanner;

public class FullTime extends JobType {

    private String start;
    private float baseSalaryPerYear, bonusPerYear;
    Scanner sc = new Scanner(System.in);

    public FullTime(String start, float baseSalaryPerYear, float bonusPerYear) {
        this.baseSalaryPerYear = baseSalaryPerYear;
        this.bonusPerYear = bonusPerYear;
    }

     public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public float getBaseSalaryPerYear() {
        return baseSalaryPerYear;
    }

    public void setBaseSalaryPerYear(float baseSalaryPerYear) {
        this.baseSalaryPerYear = baseSalaryPerYear;
    }

    public float getBonusPerYear() {
        return bonusPerYear;
    }

    public void setBonusPerYear(float bonusPerYear) {
        this.bonusPerYear = bonusPerYear;
    }

    public FullTime addFulltime(){

        System.out.println("Enter the start date");
        start = sc.nextLine();
        System.out.println("Enter the Base Salary per year for the full time employee");
        baseSalaryPerYear = sc.nextByte();
        System.out.println("Enter the Bonus per year for the full time employee");
        bonusPerYear = sc.nextByte();

        return new FullTime(start, baseSalaryPerYear, bonusPerYear);
    }
}
