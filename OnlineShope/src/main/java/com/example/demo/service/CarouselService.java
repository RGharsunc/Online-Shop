package com.example.demo.service;

import com.example.demo.entity.Carousel;
import com.example.demo.repository.CarouselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vardan on 31.07.2017.
 */
@Service
public class CarouselService {

    @Autowired
    CarouselRepository carouselRepository;

    public List<Carousel> getCarouselListOrderedByPosition() {
        return carouselRepository.findAll(sortByPositionAsc());
    }

    private Sort sortByPositionAsc() {
        return new Sort(Sort.Direction.ASC, "position");
    }

    public void addCarousel(Carousel carousel){
        carouselRepository.save(carousel);
    }

    public void saveOrUpdateCarousel(Carousel carousel){
        carouselRepository.save(carousel);
    }
}
