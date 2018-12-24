package com.abdullah;

import java.util.Scanner;

public class Contractor extends JobType{

    private String start, end;
    private float hourlyRate;
    private Scanner sc = new Scanner(System.in);

    public Contractor(String start, String end, float hourlyRate) {
        this.end = end;
        this.hourlyRate = hourlyRate;
    }

   public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Contractor addContractor(){
        System.out.println("Enter the start date");
        start = sc.nextLine();
        System.out.println("Enter the end date");
        end = sc.nextLine();
        System.out.println("Enter the hourly rate");
        hourlyRate = sc.nextByte();

        return new Contractor(start, end, hourlyRate);
    }
}
