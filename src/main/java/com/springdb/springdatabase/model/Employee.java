package com.springdb.springdatabase.model;


import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "EMP_ID", nullable = false)
    @Expose
    private long EMP_ID;
    @Column(name = "EMP_NAME", nullable = false, length = 50)
    @Expose
    private String EMP_NAME;
    @Column(name = "EMP_NO", nullable = false, length = 20, unique = true)
    @Expose
    private String EMP_NO;
    @Column(name = "HIRE_DATE", nullable = false)
    @Expose
    private Date HIRE_DATE;
    @Column(name = "IMAGE")
    @Expose
    private Blob IMAGE;
    @Column(name = "JOB", length = 30, nullable = false)
    @Expose
    private String JOB;
    @Column(name = "SALARY", nullable = false)
    @Expose
    private float SALARY;
    @Column(name = "DEPT_ID", nullable = false)
    @Expose
    private int DEPT_ID;
    @Column(name = "MNG_ID")
    @Expose
    private Integer MNG_ID;

    public Employee() {
    }

    public Employee(long EMP_ID, String EMP_NAME, String EMP_NO, Date HIRE_DATE, Blob IMAGE, String JOB, float SALARY, int DEPT_ID, Integer MNG_ID) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_NO = EMP_NO;
        this.HIRE_DATE = HIRE_DATE;
        this.IMAGE = IMAGE;
        this.JOB = JOB;
        this.SALARY = SALARY;
        this.DEPT_ID = DEPT_ID;
        this.MNG_ID = MNG_ID;
    }

    public long getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(long EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMP_NO() {
        return EMP_NO;
    }

    public void setEMP_NO(String EMP_NO) {
        this.EMP_NO = EMP_NO;
    }

    public Date getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(Date HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public Blob getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(Blob IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public float getSALARY() {
        return SALARY;
    }

    public void setSALARY(float SALARY) {
        this.SALARY = SALARY;
    }

    public int getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(int DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public Integer getMNG_ID() {
        return MNG_ID;
    }

    public void setMNG_ID(Integer MNG_ID) {
        this.MNG_ID = MNG_ID;
    }
}
