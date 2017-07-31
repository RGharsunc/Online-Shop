package com.example.demo.service;

import com.example.demo.entity.Purpose;
import com.example.demo.repository.PurposeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vardan on 26.07.2017.
 */
@Service
public class PurposeServices {

    @Autowired
    PurposeRepository purposeRepository;

    public List<Purpose> getPurposeList(){
        List<Purpose> purposes = purposeRepository.findAll();
        return purposes;
    }
    public Purpose getPurposeById(long id){
        Purpose purpose = purposeRepository.findOne(id);
        return purpose;
    }


}
