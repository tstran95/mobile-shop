package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.client.DAO.AccountDAO;
import com.vn.mobileshop.client.DAO.RoleDAO;
import com.vn.mobileshop.model.Account;
import com.vn.mobileshop.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final AccountDAO accountDAO;
    private final RoleDAO roleDAO;

    public UserDetailsServiceImpl(AccountDAO accountDAO, RoleDAO roleDAO) {
        this.accountDAO = accountDAO;
        this.roleDAO = roleDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountDAO.findByUserName(username);
        List<Role> roles = roleDAO.findAll();
        if (Objects.isNull(account)) throw new RuntimeException("Cant find user");
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
            authorities.add(authority);
        }
        return new CustomUserDetails(account , authorities);
    }
}
