package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.client.DAO.RoleDAO;
import com.vn.mobileshop.client.services.RoleService;
import com.vn.mobileshop.model.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDAO roleDAO;

    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public Role findRoleByName(String name) {
        return roleDAO.findByName(name);
    }
}
