package com.vn.mobileshop.client.controller;

import com.vn.mobileshop.client.services.ProductService;
import com.vn.mobileshop.model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Pageable;

@Controller
@RequestMapping("/api/v1/prod")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String singleProd(@PathVariable Long id, Model model) {
        Product product = productService.findProdById(id);
        System.err.println(product.getBrand().getName());
        model.addAttribute("product" , product);
        return "view/single-product";
    }

    @GetMapping("/all")
    public String showAllProd(Model model) {
        int currentPage = 0;
        int maxRecordPage = 12;
        model.addAttribute("listProd" , productService.getAllProd(currentPage , maxRecordPage));
        return "view/shop";
    }
}
