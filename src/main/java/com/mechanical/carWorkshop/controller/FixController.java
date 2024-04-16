package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.FixDto;
import com.mechanical.carWorkshop.model.FixModel;
import com.mechanical.carWorkshop.repository.FixRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fix")
public class FixController {

    @Autowired
    private FixRepository fixRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid FixDto dados){
        fixRepository.save(new FixModel(dados));
    }
}
