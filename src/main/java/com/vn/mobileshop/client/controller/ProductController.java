package com.vn.mobileshop.client.controller;

import com.vn.mobileshop.client.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/prod")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String singleProd(@PathVariable Long id, Model model) {
        model.addAttribute("product" , productService.findProdById(id));
        return "view/single-product";
    }

    @GetMapping("/all")
    public String showAllProd(Model model) {
        model.addAttribute("listProd" , productService.getAllProd());
        return "view/shop";
    }
}
