package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Vardan on 25.07.2017.
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private  BrandService brandService;


    public List<Product> productsWhereIdIsNotLike(long id) {
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

    public List<Product> getProductsByBrandId(long id) {
        List<Product> products = productRepository.findProductByBrandByBrandId(brandService.getBrandById(id));

        return products;
    }

    public List<Product> getProductsList() {
        return productRepository.findAll();
    }


    public void deleteProductFromAdminByName(String prodName) {
        productRepository.deleteByProdName(prodName);

    }

    public List<Product> getAllProductsList() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product fileUpload(Product product, MultipartFile image) throws IOException {
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
        return product;


    }
}
