package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.*;

import java.util.List;


@Controller
public class MainController {
@Value("${online-shop.filedownload.path}")
private String fileDownloadPath;

    @Autowired
  private  ProductService productService;
    @Autowired
    private  CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/")
    public String main(ModelMap modelMap) {

        List<Product> products = productService.getAllProductsList();
        List<Category> categories = categoryService.getAllCategoriesList();
        List<Brand> brands = brandService.getBrandsList();
        List<Carousel> carousels = carouselService.getCarouselListOrderedByPosition();


        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("carousels", carousels);

        return "index";
    }

    @RequestMapping(value = "#")
    public String home1() {
        return "index";
    }

    @RequestMapping(value = "/product")
    public String toShop(ModelMap modelMap) {
        List<Product> prod = productService.getAllProductsList();
        modelMap.addAttribute(prod);
        return "shop";
    }

    @ResponseBody
    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    public byte[] getImageAsByteArray(@RequestParam("filename") String filename) throws Exception {
        InputStream in = new FileInputStream(fileDownloadPath + filename);
        return org.apache.commons.io.IOUtils.toByteArray(in);
    }


    @RequestMapping(value = "/product-details")
    public String toProductDetails(ModelMap modelMap) {

        List<Product> products = productService.getProductsList();
        List<Category> categories = categoryService.getCategories();
        List<Brand> brands = brandService.getBrandsList();


        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("brands", brands);

        return "product-details";
    }


    @RequestMapping(value = "/checkout")
    public String toCheckout() {
        return "checkout";
    }

    @RequestMapping(value = "/cart")
    public String toCart() {
        return "cart";
    }


    @RequestMapping(value = "/blog")
    public String toBlog() {
        return "blog";
    }

    @RequestMapping(value = "/blog-single")
    public String toBlogSingle() {
        return "blog_single";
    }

    @RequestMapping(value = "/404")
    public String to404() {
        return "404";
    }

    @RequestMapping(value = "/contact-us")
    public String toContactUs() {
        return "contact-us";
    }

    @RequestMapping(value = "/admin")
    public String toAdminJSP(ModelMap modelMap) {

        List<Product> products = productService.getAllProductsList();
        List<Category> categories = categoryService.getAllCategoriesList();
        List<Brand> brands = brandService.getBrandsList();
        List<Carousel> carousels = carouselService.getCarouselListOrderedByPosition();


        modelMap.addAttribute("brands", brands);
        modelMap.addAttribute("products", products);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("carousels", carousels);
        return "admin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }

}
