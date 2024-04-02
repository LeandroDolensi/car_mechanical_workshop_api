package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.MechanicDto;
import com.mechanical.carWorkshop.model.MechanicModel;
import com.mechanical.carWorkshop.repository.MechanicRepository;
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
    public void cadastrar(@RequestBody MechanicDto dados){
        mechanicRepository.save(new MechanicModel(dados));
    }
}
