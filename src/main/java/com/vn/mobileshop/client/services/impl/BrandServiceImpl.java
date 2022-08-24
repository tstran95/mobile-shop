package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.client.DAO.BrandDAO;
import com.vn.mobileshop.client.services.BrandService;
import com.vn.mobileshop.model.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    private final BrandDAO brandDAO;

    public BrandServiceImpl(BrandDAO brandDAO) {
        this.brandDAO = brandDAO;
    }

    @Override
    public List<Brand> findAllBrand() {
        return brandDAO.findAll();
    }
}
