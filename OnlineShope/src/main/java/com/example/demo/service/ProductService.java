package com.example.demo.service;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Product;
import com.example.demo.entity.Purpose;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.KeySelector;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vardan on 25.07.2017.
 */
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
            BrandService brandService;
//    BrandRepository brandRepository;
    @Autowired
    PurposeServices purposeServices;

    public List<Product> productsWhereIdIsNotLike(long id){
        List<Product> products = productRepository.findByIdIsNotLike(id);
        return products;
    }

    public List<Product> getProductsByCategoryId(long id) {
        List<Product> products = productRepository.findProductByCategoryByCategoryId(categoryRepository.findOne(id));


        return products;
    }


    public Product getProductById(long id) {
        Product product = productRepository.findOne(id);


        return product;
    }

    public List<Product> getProductsByBrandId(long id){
        List<Product> products = productRepository.findProductByBrandByBrandId(brandService.getBrandById(id));

        return products;
    }

    public List<Product> getProductsList() {
        return productRepository.findAll();
    }

    public List<Product> getProductListByPurpose(long id){
        List<Product> products = productRepository.findProductByPurposeByPurposeId(purposeServices.getPurposeById(id));
        return products;
    }

    public void deleteProductFromAdminByName(String prodName){
        productRepository.deleteByProdName(prodName);

    }
    public List<Product> getAllProductsList(){
        List<Product> products = productRepository.findAll();
        return products;
    }
    @Transactional

    public void updateProductByViews(long id){


        long view = productRepository.findOne(id).getView();
        long newView=view+1;
        productRepository.updateProduct(newView,id);
       view = productRepository.findOne(id).getView();

    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

}
