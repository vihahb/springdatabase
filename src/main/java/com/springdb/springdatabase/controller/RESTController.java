package com.springdb.springdatabase.controller;

import com.springdb.springdatabase.model.*;
import com.springdb.springdatabase.repository.DepartmentRepository;
import com.springdb.springdatabase.repository.EmployeeRepository;
import com.springdb.springdatabase.repository.SalaryGradeRepository;
import com.springdb.springdatabase.repository.TimeKeeperRepository;
import com.springdb.springdatabase.respond.CustomRespond;
import com.springdb.springdatabase.utils.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    DepartmentRepository department;
    @Autowired
    EmployeeRepository employee;
    @Autowired
    SalaryGradeRepository salaryGrade;
    @Autowired
    TimeKeeperRepository timeKeeper;

    //Get all Department
    @GetMapping("/departments")
    public String getAllDepartment() {

        List<Department> departmentList = (List<Department>) department.findAll();
        return JsonHelper.toJson(new CustomRespond(departmentList.size() + " row has returned!", 0, departmentList));
    }

    //Get all employee
    @GetMapping("/employees")
    public String getAllEmployees() {

        List<Employee> employeeList = (List<Employee>) employee.findAll();
        return JsonHelper.toJson(new CustomRespond(employeeList.size() + " row has returned!", 0, employeeList));
    }

    //Get all salaryGrade
    @GetMapping("/salaryAll")
    public String getAllSalaryGrade() {

        List<SalaryGrade> salaryGradeList = (List<SalaryGrade>) salaryGrade.findAll();
        return JsonHelper.toJson(new CustomRespond(salaryGradeList.size() + " row has returned!", 0, salaryGradeList));
    }

    //Get all timeKeeper
    @GetMapping("/timekeepers")
    public String getAllTimeKeeper() {

        List<TimeKeeper> timeKeeperList = (List<TimeKeeper>) timeKeeper.findAll();
        return JsonHelper.toJson(new CustomRespond(timeKeeperList.size() + " row has returned!", 0, timeKeeperList));
    }

    // Create a new Department
    // Create a new employee
    // Create a new salaryGrade
    // Create a new timeKeeper

    // Get a Single Department
    @GetMapping("/department={id}")
    public String getADepartment(@PathVariable(value = "id") int id) {
        try {
            Department aDepartment = department.findById(id);
            return JsonHelper.toJson(new CustomRespond("One row has returned!", 0, aDepartment));
        } catch (Exception e) {
            if (e instanceof NoSuchElementException) {
                return JsonHelper.toJson(new CustomRespond("Department id not found exception!", 5, null));
            } else
                return JsonHelper.toJson(new CustomRespond("Unknow exception!", 5, null));
        }
    }


    /**
     * Using path param
     */
    @GetMapping("/rangeDepartment")
    public String getRangeDepartment(@RequestParam(value = "sId") int sId, @RequestParam(value = "eId") int eId) {

        System.out.println("Start ID is: " + sId);
        System.out.println("End ID is: " + eId);

        if (sId < 1) {
            return JsonHelper.toJson(new CustomRespond("Department start id not null!", 6, null));
        }
        if (eId < 1) {
            return JsonHelper.toJson(new CustomRespond("Department end id not null!", 6, null));
        }
        List<Department> departmentList = (List<Department>) department.findAllByDEPT_ID(sId, eId);
        return JsonHelper.toJson(new CustomRespond(departmentList.size() + " row has returned!", 0, departmentList));

//        if (rangeId != null) {
//
//        } else {
//            return JsonHelper.toJson(new CustomRespond("Start and End Id not null!", 1, null));
//        }
//        try {
//            List<Department> departmentList = department.findAllBy(startID, endID);
//            return JsonHelper.toJson(new CustomRespond(departmentList.size() + " row has returned!", 0, departmentList));
//        } catch (Exception e) {
//            if (e instanceof NoSuchElementException) {
//                return JsonHelper.toJson(new CustomRespond("Department id not found exception!", 5, null));
//            } else
//                return JsonHelper.toJson(new CustomRespond("Unknow exception!", 5, null));
//        }
    }
    // Get a Single employee
    // Get a Single salaryGrade
    // Get a Single timeKeeper

    // Update a Department
    // Update a employee
    // Update a salaryGrade
    // Update a timeKeeper

    // Delete a Department
    // Delete a employee
    // Delete a salaryGrade
    // Delete a timeKeeper
}
