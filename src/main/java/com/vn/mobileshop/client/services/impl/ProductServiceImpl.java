package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.client.DAO.ProductDAO;
import com.vn.mobileshop.client.services.ProductService;
import com.vn.mobileshop.exception.BaseException;
import com.vn.mobileshop.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Override
    public List<Product> getAllProd() {
        return productDAO.findAll();
    }

    @Override
    public Product findProdById(Long id) {
        return productDAO.findById(id).
                        orElseThrow(() -> new BaseException("Cant find Product with id : " + id));
    }
}
