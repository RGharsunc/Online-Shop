package com.example.demo.repository;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vardan on 23.07.2017.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByCategoryByCategoryId(Category category);




    List<Product> findByIdIsNotLike(long id);

    List<Product> findProductByBrandByBrandId(Brand brand);



    @Transactional
    void deleteByProdName(String prodName);


}

















