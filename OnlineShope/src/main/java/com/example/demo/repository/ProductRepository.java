package com.example.demo.repository;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * Created by Vardan on 23.07.2017.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findProductByCategoryByCategoryId(Category category);

//
//    @Modifying
//    @Transactional
//    @Query("update UserEntity us set us.nickname=:qNickname, us.firstName=:qFirstName, us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
//    public void updateUser(@Param("qNickname") String nickname, @Param("qFirstName") String firstName,
//                           @Param("qLastName") String qLastName, @Param("qPassword") String password, @Param("qId") Integer id);

//
//    @Query("select  Category category where category.id!=:qId")
//    Category getCategory(@Param("qId") Long id);
//
//    @Query("select categorys from CategoryEntity category where category.id=:qId")
//    Category getCategory(@Param("qId") Long id);


//        @Query("select products from Product product where product.id not like ?1")
//        List<Product> findByIdIsNotLike (@RequestParam ("Id") long id);


    List<Product> findByIdIsNotLike(long id);

    List<Product> findProductByBrandByBrandId(Brand brand);


    List<Product> findProductByPurposeByPurposeId(Purpose purpose);

    @Transactional
    void deleteByProdName(String prodName);


    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Product product set product.view=:qView where product.id=:qId")
    int updateProduct(@Param("qView") long view, @Param("qId") long id);


}

















