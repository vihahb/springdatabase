package com.springdb.springdatabase.repository;

import com.springdb.springdatabase.model.Employee;
import com.springdb.springdatabase.model.EmployeeByDepartment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Long> {

    @Query("select e.EMP_ID, e.EMP_NAME, e.SALARY, d.DEPT_NAME from employee e  where d.DEPT_ID = 20 order by employee.SALARY asc")
    Iterable<EmployeeByDepartment> findAllByDEPT_ID(@Param(value = "id") int id);

}
