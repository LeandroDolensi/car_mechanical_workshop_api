package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.car.Car;
import com.mechanical.carWorkshop.car.CarRepository;
import com.mechanical.carWorkshop.car.DadosCar;
import com.mechanical.carWorkshop.mechanic.DadosMechanic;
import com.mechanical.carWorkshop.mechanic.Mechanic;
import com.mechanical.carWorkshop.mechanic.MechanicRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mechanic")
public class MechanicController {

    @Autowired
    private MechanicRepository mechanicRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosMechanic dados){
        mechanicRepository.save(new Mechanic(dados));
    }
}
