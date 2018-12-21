package com.abdullah;

import java.util.Date;

public class Contractor extends JobType {

    private Date end;
    private float hourlyRate;

    public Contractor(Date start, Date end, float hourlyRate) {
        super(start);
        this.end = end;
        this.hourlyRate = hourlyRate;
    }

   /* public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }*/

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
