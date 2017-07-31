package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Purpose;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.BrandService;
import com.example.demo.service.ProductService;
import com.example.demo.service.PurposeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Vardan on 26.07.2017.
 */

@Controller
public class PurposeController {


    @Autowired
    ProductService productService;
    @Autowired
    PurposeServices purposeServices;
    @Autowired
    BrandService brandService;





}
