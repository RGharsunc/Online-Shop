package com.example.demo.controller;

import com.example.demo.entity.Carousel;
import com.example.demo.repository.CarouselRepository;
import com.example.demo.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Vardan on 31.07.2017.
 */

@Controller
public class CarouselController {
    @Autowired
    CarouselService carouselService;

    @RequestMapping(value = "/admin/carousel/add", method = RequestMethod.POST)
    public String addCarousel(@ModelAttribute("carousel") Carousel carousel,
                              @RequestParam("img1") MultipartFile image1,
                              @RequestParam("img2") MultipartFile image2,
                              @RequestParam("carouselsPosition") long position) throws IOException {
        //file upload
        File dir = new File("d:\\java");
        if (!dir.exists()) {
            dir.mkdir();
        }
        //create the file on server
        String carouselImage1 = System.currentTimeMillis() + "_" + image1.getOriginalFilename();
        String carouselImage2 = System.currentTimeMillis() + "_" + image2.getOriginalFilename();
        File serverFile1 = new File(dir.getAbsolutePath() + "\\" + carouselImage1);
        File serverFile2 = new File(dir.getAbsolutePath() + "\\" + carouselImage2);
        BufferedOutputStream stream1 = new BufferedOutputStream(new FileOutputStream(serverFile1));
        BufferedOutputStream stream2 = new BufferedOutputStream(new FileOutputStream(serverFile2));
        stream1.write(image1.getBytes());
        stream2.write(image2.getBytes());
        stream1.close();
        stream2.close();
        carousel.setImage1(carouselImage1);
        carousel.setImage2(carouselImage2);
        if (position == 0) {
            if (carouselService.getCarouselListOrderedByPosition() != null) {
                List<Carousel> carouselListOrderedByPosition = carouselService.getCarouselListOrderedByPosition();
                for (Carousel carousel1 : carouselListOrderedByPosition) {
                    carousel1.setPosition(carousel1.getPosition()+1);
                    carouselService.saveOrUpdateCarousel(carousel1);
                }

                carousel.setPosition(carouselService.getCarouselListOrderedByPosition().get(0).getPosition()-1);

            } else {
                carousel.setPosition(carouselService.getCarouselListOrderedByPosition().get(0).getPosition() - 1);

            }
        } else {
            for (Carousel car:carouselService.getCarouselListOrderedByPosition()){
               if (car.getPosition()>position){
                   car.setPosition(car.getPosition()+1);
                   carouselService.addCarousel(car);
               }
            }

            carousel.setPosition(position + 1);
        }
        carouselService.addCarousel(carousel);
        return "redirect:/admin";


    }

}
