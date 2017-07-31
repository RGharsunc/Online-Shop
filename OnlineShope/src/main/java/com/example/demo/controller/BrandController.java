package com.example.demo.controller;

import com.example.demo.entity.Brand;
import com.example.demo.repository.BrandRepository;
import com.example.demo.service.BrandService;
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
public class BrandController {

    @Autowired
    BrandService brandService;

    @RequestMapping(value = "/admin/brand/add", method = RequestMethod.POST)
    public String addBrandFromAdmin(@ModelAttribute("addBrand") Brand brand) {
        brandService.addBrand(brand);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/admin/brand/delete", method = RequestMethod.POST)
    public String deleteBrandFromAdminByBrandname(@RequestParam("brandName") String brandName) {
        brandService.deleteBrandByBrandname(brandName);
        return "redirect:/admin";
    }


}
