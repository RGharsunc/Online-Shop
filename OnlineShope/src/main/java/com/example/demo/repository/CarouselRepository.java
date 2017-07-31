package com.example.demo.repository;

import com.example.demo.entity.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vardan on 31.07.2017.
 */

public interface CarouselRepository extends JpaRepository<Carousel, Long> {

//
//    @Modifying(clearAutomatically = true)
//    @Transactional
//    @Query("update Carousel car set car.=:qView where product.id=:qId")
//    int updateProduct(@Param("qView") long view, @Param("qId") long id);


}
