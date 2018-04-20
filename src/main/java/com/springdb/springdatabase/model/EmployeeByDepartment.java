package com.springdb.springdatabase.model;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class EmployeeByDepartment implements RowMapper<Employee> {

    private Long EMP_ID;
    private String EMP_NAME;
    private float SALARY;
    private String DEPT_NAME;

    public EmployeeByDepartment() {
    }

    public EmployeeByDepartment(Long EMP_ID, String EMP_NAME, float SALARY, String DEPT_NAME) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.SALARY = SALARY;
        this.DEPT_NAME = DEPT_NAME;
    }

    public Long getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Long EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public float getSALARY() {
        return SALARY;
    }

    public void setSALARY(float SALARY) {
        this.SALARY = SALARY;
    }

    public String getDEPT_NAME() {
        return DEPT_NAME;
    }

    public void setDEPT_NAME(String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }

    @Override
    public String toString() {
        return "EmployeeByDepartment{" +
                "EMP_ID=" + EMP_ID +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", SALARY=" + SALARY +
                ", DEPT_NAME='" + DEPT_NAME + '\'' +
                '}';
    }

    @Override
    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}
