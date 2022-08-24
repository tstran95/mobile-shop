package com.vn.mobileshop.client.services;

import com.vn.mobileshop.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProd();

    Product findProdById(Long id);
}
