package com.example.demo.repository;

import com.example.demo.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vardan on 26.07.2017.
 */
public interface BrandRepository extends JpaRepository<Brand, Long> {

     public Brand findByBrandName(String brandName);

     @Transactional
     public void deleteByBrandName(String brandName);
}
