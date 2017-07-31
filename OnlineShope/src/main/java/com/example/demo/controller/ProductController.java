package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Purpose;
import com.example.demo.service.BrandService;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.service.PurposeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Vardan on 24.07.2017.
 */

@Controller
public class ProductController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Autowired
    PurposeServices purposeServices;


    @RequestMapping(value = "/products/by/category/{id}")
    public String showProductsByCategoryId(@PathVariable("id") long id, ModelMap modelMap) {


        List<Category> categories = categoryService.getCategories();
        List<Product> products = productService.getProductsByCategoryId(id);
        List<Brand> brands = brandService.getBrandsList();
        List<Purpose> purposes = purposeServices.getPurposeList();

        modelMap.addAttribute("purposes", purposes);
        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        return "index";

    }

    @RequestMapping(value = "/product/details/{id}")
    public String getProductById(@PathVariable("id") long id, ModelMap modelMap) {


        productService.updateProductByViews(id);
        Product product = productService.getProductById(id);
        List<Category> categories = categoryService.getCategories();
        List<Product> productsNotSameId = productService.productsWhereIdIsNotLike(id);
        List<Purpose> purposes = purposeServices.getPurposeList();
        List<Brand> brands = brandService.getBrandsList();

        modelMap.addAttribute("purposes", purposes);
        modelMap.addAttribute("product", product);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("productsNotSameId", productsNotSameId);
        modelMap.addAttribute("brands", brands);
        return "product-details";
    }

    @RequestMapping(value = "/product/by/brand/{id}")
    public String getProductsByBrandId(@PathVariable("id") long id, ModelMap modelMap) {
        List<Product> products = productService.getProductsByBrandId(id);
        List<Category> categories = categoryService.getCategories();
        List<Brand> brands = brandService.getBrandsList();
        List<Purpose> purposes = purposeServices.getPurposeList();

        modelMap.addAttribute("purposes", purposes);
        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        return "index";
    }

    @RequestMapping(value = "/product/by/purpose/{id}")
    public String getProductsByPurposeId(@RequestParam("id") long id, ModelMap modelMap) {

        List<Category> categories = categoryService.getCategories();
        List<Brand> brands = brandService.getBrandsList();
        List<Purpose> purposes = purposeServices.getPurposeList();
        List<Product> products = productService.getProductListByPurpose(id);

        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("purposes", purposes);
        modelMap.addAttribute("products", products);


        return "index";


    }

    @RequestMapping(value = "/admin/product/delete")
    public String deleteProductFromAdmin(@RequestParam("prodName") String prodName) {
        productService.deleteProductFromAdminByName(prodName);
        return "redirect:/admin";
    }
}
