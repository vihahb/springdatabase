package com.springdb.springdatabase.model;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "DEPT_ID", nullable = false)
    @Expose
    private int DEPT_ID;
    @Column(name = "DEPT_NAME", nullable = false, length = 255)
    @Expose
    private String DEPT_NAME;
    @Column(name = "DEPT_NO", nullable = false, unique = true, length = 20)
    @Expose
    private String DEPT_NO;
    @Column(name = "LOCATION", length = 255)
    @Expose
    private String LOCATION;

    public Department() {
    }

    public Department(int DEPT_ID, String DEPT_NAME, String DEPT_NO, String LOCATION) {
        this.DEPT_ID = DEPT_ID;
        this.DEPT_NAME = DEPT_NAME;
        this.DEPT_NO = DEPT_NO;
        this.LOCATION = LOCATION;
    }

    public int getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(int DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getDEPT_NAME() {
        return DEPT_NAME;
    }

    public void setDEPT_NAME(String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }

    public String getDEPT_NO() {
        return DEPT_NO;
    }

    public void setDEPT_NO(String DEPT_NO) {
        this.DEPT_NO = DEPT_NO;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }

    public String getDept_name() {
        return DEPT_NAME;
    }

    public void setDept_name(String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }

    public String getDept_no() {
        return DEPT_NO;
    }

    public void setDept_no(String DEPT_NO) {
        this.DEPT_NO = DEPT_NO;
    }

    public String getLocation() {
        return LOCATION;
    }

    public void setLocation(String LOCATION) {
        this.LOCATION = LOCATION;
    }
}