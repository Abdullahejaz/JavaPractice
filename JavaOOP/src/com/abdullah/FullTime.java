package com.abdullah;

import java.util.Date;

public class FullTime {

    private Date start;
    private float baseSalaryPerYear, bonusPerYear;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
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
}
