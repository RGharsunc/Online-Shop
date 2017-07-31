package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Vardan on 28.07.2017.
 */
@Controller
public class CategoryController {

    @Autowired

    CategoryService categoryService;




    @RequestMapping(value = "/admin/category/add", method = RequestMethod.POST)
    public String addCategoryFromAdmin(@ModelAttribute("addCategory") Category category) {
        categoryService.addCategory(category);
        return "redirect:/admin";
    }


    @RequestMapping(value = "/admin/category/delete", method = RequestMethod.POST)
    public String deleteCategoryFromAdminByBrandname(@RequestParam ("categoryName") String categoryName){
        categoryService.deleteCategoryFromAdminByCategoryname(categoryName);
        return "redirect:/admin";

    }
}
