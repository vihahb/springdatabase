package com.springdb.springdatabase.repository;

import com.springdb.springdatabase.model.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends Repository<Department, Integer> {

    @Query("SELECT p.DEPT_ID, p.DEPT_NAME, p.DEPT_NO, p.LOCATION FROM Department p where p.DEPT_ID between :id1 and :id2")
    Iterable<Department> findAllByDEPT_ID(@Param("id1") int startId, @Param("id2") int endId);

    @Query("SELECT p FROM Department p")
    Iterable<Department> findAll();

    @Query("select p from Department p where p.DEPT_ID = :id")
    Department findById(@Param("id") int id);

//    @Query("SELECT p FROM Product p inner join p.category c where p.name like :name and c.id like :categoryId")
//    List<Product> searchProduct(@Param("name") String key, @Param("categoryId") String categoryId, Pageable pageable);

}
