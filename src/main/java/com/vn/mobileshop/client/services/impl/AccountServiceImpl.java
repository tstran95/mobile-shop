package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.Constant;
import com.vn.mobileshop.client.DAO.AccountDAO;
import com.vn.mobileshop.client.services.AccountService;
import com.vn.mobileshop.client.services.RoleService;
import com.vn.mobileshop.model.Account;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountDAO accountDAO;
    private final RoleService roleService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AccountServiceImpl(AccountDAO accountDAO, RoleService roleService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.accountDAO = accountDAO;
        this.roleService = roleService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public Account save(Account account) {
        String passBCrypt = bCryptPasswordEncoder.encode(account.getPassword());
        Account acc = Account.builder()
                            .firstName(account.getFirstName())
                            .lastName(account.getLastName())
                            .userName(account.getUserName())
                            .password(passBCrypt)
                            .passConfirm(passBCrypt)
                            .email(account.getEmail())
                            .gender(account.getGender())
                            .enable(true)
                            .roles(Set.of(roleService.findRoleByName(Constant.USER)))
                            .build();
        return accountDAO.save(acc);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDAO.findAll();
    }
}
