package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vardan on 25.07.2017.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Transactional
    public void deleteByCategory(String categoryName);
}
