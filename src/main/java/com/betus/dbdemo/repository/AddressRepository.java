package com.betus.dbdemo.repository;

import com.betus.dbdemo.model.Address;
import com.betus.dbdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepository extends JpaRepository<Address,Long> {
}
