package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.BrandService;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vardan on 25.07.2017.
 */
@Controller
public class ShopController {


    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @RequestMapping(value = "/products")
    public String toShopJSP(ModelMap modelMap){
        List<Product> products = productService.getProductsList();
        List<Category> categories=categoryService.getCategories();
        List<Brand> brands=brandService.getBrandsList();


        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products",products);
        modelMap.addAttribute("categories",categories);
        return "shop";
    }

}
