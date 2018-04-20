package com.springdb.springdatabase.model;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary_grade")
public class SalaryGrade {
    @Id
    @Column(name = "GRADE", nullable = false)
    @Expose
    private int GRADE;
    @Column(name = "HIGH_SALARY", nullable = false)
    @Expose
    private float HIGH_SALARY;
    @Column(name = "LOW_SALARY", nullable = false)
    @Expose
    private float LOW_SALARY;

    public SalaryGrade() {
    }

    public SalaryGrade(int GRADE, float HIGH_SALARY, float LOW_SALARY) {
        this.GRADE = GRADE;
        this.HIGH_SALARY = HIGH_SALARY;
        this.LOW_SALARY = LOW_SALARY;
    }

    public int getGRADE() {
        return GRADE;
    }

    public void setGRADE(int GRADE) {
        this.GRADE = GRADE;
    }

    public float getHIGH_SALARY() {
        return HIGH_SALARY;
    }

    public void setHIGH_SALARY(float HIGH_SALARY) {
        this.HIGH_SALARY = HIGH_SALARY;
    }

    public float getLOW_SALARY() {
        return LOW_SALARY;
    }

    public void setLOW_SALARY(float LOW_SALARY) {
        this.LOW_SALARY = LOW_SALARY;
    }
}
