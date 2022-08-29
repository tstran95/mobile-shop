package com.vn.mobileshop.client.DAO;

import com.vn.mobileshop.model.Account;
import com.vn.mobileshop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleDAO extends JpaRepository<Role , Long> {
    @Query(value = "SELECT e FROM Role e WHERE e.roleName = :name")
    Role findByName(@Param(value = "name") String name);
}
