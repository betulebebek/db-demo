package com.betus.dbdemo.security.repository;

import com.betus.dbdemo.security.models.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserTable, Integer> {
    UserTable findByUsername(String username);
}
