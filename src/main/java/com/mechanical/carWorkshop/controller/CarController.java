package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.model.CarModel;
import com.mechanical.carWorkshop.repository.CarRepository;
import com.mechanical.carWorkshop.dto.CarDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody CarDto dados){
        carRepository.save(new CarModel(dados));
    }
}
