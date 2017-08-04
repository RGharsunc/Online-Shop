package com.example.demo.service;

import com.example.demo.entity.Category;

import com.example.demo.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Vardan on 25.07.2017.
 */
@Service
public class CategoryService {

    @Autowired
  private  CategoryRepository categoryRepository;


    public List<Category>  getCategories(){

        List<Category> categories=categoryRepository.findAll();
         return categories;
    }
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public void deleteCategoryFromAdminByCategoryname(String categoryName){
        categoryRepository.deleteByCategory(categoryName);
    }
    public List<Category> getAllCategoriesList(){
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
}
