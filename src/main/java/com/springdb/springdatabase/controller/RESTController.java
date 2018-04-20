package com.springdb.springdatabase.controller;


import com.springdb.springdatabase.model.Department;
import com.springdb.springdatabase.model.Employee;
import com.springdb.springdatabase.model.SalaryGrade;
import com.springdb.springdatabase.model.TimeKeeper;
import com.springdb.springdatabase.repository.DepartmentRepository;
import com.springdb.springdatabase.repository.EmployeeRepository;
import com.springdb.springdatabase.repository.SalaryGradeRepository;
import com.springdb.springdatabase.repository.TimeKeeperRepository;
import com.springdb.springdatabase.respond.CustomRespond;
import com.springdb.springdatabase.utils.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/rangeDepartment?startId={startId}&endId={endId}")
    public String getRangeDepartment(
            @PathVariable(value = "startId") int startID,
            @PathVariable(value = "endId") int endID
    ) {

        List<Department> departmentList = department.findAllByDEPT_ID(startID, endID);
        return JsonHelper.toJson(new CustomRespond(departmentList.size() + " row has returned!", 0, departmentList));
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
