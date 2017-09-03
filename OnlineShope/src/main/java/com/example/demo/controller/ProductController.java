package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Carousel;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.BrandService;
import com.example.demo.service.CarouselService;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created by Vardan on 24.07.2017.
 */

@Controller
public class ProductController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private  ProductService productService;
    @Autowired
    private  BrandService brandService;
    @Autowired
    private  CarouselService carouselService;


    @RequestMapping(value = "/products/by/category/{id}")
    public String showProductsByCategoryId(@PathVariable("id") long id, ModelMap modelMap) {


        List<Category> categories = categoryService.getCategories();
        List<Product> products = productService.getProductsByCategoryId(id);
        List<Brand> brands = brandService.getBrandsList();
        List<Carousel> carousels = carouselService.getCarouselListOrderedByPosition();




        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("carousels", carousels);
        return "index";

    }

    @RequestMapping(value = "/product/details/{id}")
    public String getProductById(@PathVariable("id") long id, ModelMap modelMap) {



        Product product = productService.getProductById(id);
        List<Category> categories = categoryService.getCategories();
        List<Product> productsNotSameId = productService.productsWhereIdIsNotLike(id);
        List<Brand> brands = brandService.getBrandsList();


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
        List<Carousel> carousels = carouselService.getCarouselListOrderedByPosition();


        modelMap.addAttribute("carousels", carousels);

        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        return "index";
    }



    @RequestMapping(value = "/admin/product/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("addProduct") Product product,
                             @RequestParam("img") MultipartFile image
    ) throws IOException {
        Product productWithFile = productService.fileUpload(product, image);
        productService.addProduct(productWithFile);
        return "redirect:/admin";
    }


    @RequestMapping(value = "/admin/product/delete")
    public String deleteProductFromAdmin(@RequestParam("prodName") String prodName) {
        productService.deleteProductFromAdminByName(prodName);
        return "redirect:/admin";
    }
}
