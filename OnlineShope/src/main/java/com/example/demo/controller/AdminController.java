package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

/**
 * Created by Vardan on 25.07.2017.
 */
@Controller
public class AdminController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;



    @RequestMapping(value = "/admin/product/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("addProduct") Product product,
                             @RequestParam("img") MultipartFile image
    ) throws IOException {
        //file upload
        File dir = new File("d:\\java");
        if (!dir.exists()) {
            dir.mkdir();
        }
        //create the file on server
        String productPic = System.currentTimeMillis() + "_" + image.getOriginalFilename();
        File serverFile = new File(dir.getAbsolutePath() + "\\" + productPic);
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
        stream.write(image.getBytes());
        stream.close();
        product.setImage(productPic);
        productService.addProduct(product);
        return "redirect:/admin";


    }

}

