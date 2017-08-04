package com.example.demo.service;

import com.example.demo.entity.Brand;
import com.example.demo.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vardan on 26.07.2017.
 */
@Service
public class BrandService {


    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> getBrandsList() {
        List<Brand> brands = brandRepository.findAll();
        return brands;

    }

    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public void deleteBrandByBrandname(String brandName) {
        brandRepository.deleteByBrandName(brandName);
    }

    Brand getBrandById(long id) {
        return brandRepository.findOne(id);
    }


}
