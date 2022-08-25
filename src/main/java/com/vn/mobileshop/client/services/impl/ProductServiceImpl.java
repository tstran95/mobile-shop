package com.vn.mobileshop.client.services.impl;

import com.vn.mobileshop.client.DAO.ProductDAO;
import com.vn.mobileshop.client.services.ProductService;
import com.vn.mobileshop.exception.BaseException;
import com.vn.mobileshop.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;

    @Override
    public List<Product> getAllProd(int currentPage , int maxRecordPage) {
        Page<Product> page = productDAO.findAll(PageRequest.of(currentPage, maxRecordPage));
        return page.getContent();
    }

    @Override
    public Product findProdById(Long id) {
        return productDAO.findById(id).
                        orElseThrow(() -> new BaseException("Cant find Product with id : " + id));
    }
}
