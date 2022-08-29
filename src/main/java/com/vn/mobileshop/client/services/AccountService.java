package com.vn.mobileshop.client.services;

import com.vn.mobileshop.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    Account save(Account account);

    List<Account> findAllAccount();
}
