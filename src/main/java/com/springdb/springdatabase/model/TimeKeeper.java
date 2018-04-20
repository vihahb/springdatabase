package com.springdb.springdatabase.model;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name = "timekeeper")
public class TimeKeeper {
    @Id
    @Column(name = "Timekeeper_Id", nullable = false, length = 36)
    @Expose
    private String Timekeeper_Id;
    @Column(name = "Date_Time", nullable = false)
    @Expose
    private Calendar Date_Time;
    @Column(name = "In_Out", nullable = false, length = 1)
    @Expose
    private char In_Out;
    @Column(name = "EMP_ID", nullable = false)
    @Expose
    private long EMP_ID;

    public TimeKeeper() {
    }

    public TimeKeeper(String timekeeper_Id, Calendar date_Time, char in_Out, long EMP_ID) {
        Timekeeper_Id = timekeeper_Id;
        Date_Time = date_Time;
        In_Out = in_Out;
        this.EMP_ID = EMP_ID;
    }

    public String getTimekeeper_Id() {
        return Timekeeper_Id;
    }

    public void setTimekeeper_Id(String timekeeper_Id) {
        Timekeeper_Id = timekeeper_Id;
    }

    public Calendar getDate_Time() {
        return Date_Time;
    }

    public void setDate_Time(Calendar date_Time) {
        Date_Time = date_Time;
    }

    public char getIn_Out() {
        return In_Out;
    }

    public void setIn_Out(char in_Out) {
        In_Out = in_Out;
    }

    public long getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(long EMP_ID) {
        this.EMP_ID = EMP_ID;
    }
}
