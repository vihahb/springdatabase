package com.springdb.springdatabase.model;

import com.google.gson.annotations.Expose;

public class RangeId {

    @Expose
    private int startId;
    @Expose
    private int endId;

    public RangeId() {
    }

    public RangeId(int startId, int endId) {
        this.startId = startId;
        this.endId = endId;
    }

    public int getStartId() {
        return startId;
    }

    public void setStartId(int startId) {
        this.startId = startId;
    }

    public int getEndId() {
        return endId;
    }

    public void setEndId(int endId) {
        this.endId = endId;
    }
}
