package com.vn.mobileshop.client.services;

import com.vn.mobileshop.model.Product;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {
    List<Product> getAllProd(int currentPage , int maxRecordPage);

    Product findProdById(Long id);
}
