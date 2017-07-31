package com.example.demo.repository;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vardan on 26.07.2017.
 */

public interface PurposeRepository extends JpaRepository<Purpose, Long> {

}
