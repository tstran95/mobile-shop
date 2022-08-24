package com.vn.mobileshop.client.controller;

import com.vn.mobileshop.client.services.BrandService;
import com.vn.mobileshop.client.services.ProductService;
import com.vn.mobileshop.model.Brand;
import com.vn.mobileshop.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class HomeController {
    private final ProductService productService;
    private final BrandService brandService;

    public HomeController(ProductService productService, BrandService brandService) {
        this.productService = productService;
        this.brandService = brandService;
    }

    @GetMapping
    public String goHomePage(Model model) {
        List<Product> listProd = productService.getAllProd();
        List<Brand> listBrand = brandService.findAllBrand();
        System.out.println(listProd.toString());
        model.addAttribute("listProd" , listProd);
        model.addAttribute("listBrand" , listBrand);
        return "view/home";
    }
}
