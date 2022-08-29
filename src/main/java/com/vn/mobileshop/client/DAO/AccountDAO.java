package com.vn.mobileshop.client.DAO;

import com.vn.mobileshop.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account , Long> {
    @Query("SELECT e FROM Account e WHERE e.userName = :name")
    Account findByUserName(@Param(value = "name") String name);
}
