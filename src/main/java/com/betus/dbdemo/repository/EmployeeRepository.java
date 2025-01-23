package com.betus.dbdemo.repository;

import com.betus.dbdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e " +
            "WHERE e.firstName LIKE 'B%' OR e.lastName LIKE 'B%' " +
            "ORDER BY e.identify DESC")

    List<Employee> getTenEmployeeStartWithB();
}
