package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.FixRequestDto;
import com.mechanical.carWorkshop.model.FixModel;
import com.mechanical.carWorkshop.repository.FixRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fix")
public class FixController {

    @Autowired
    private FixRepository fixRepository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid FixRequestDto fixRequestDto){
        fixRepository.save(new FixModel(fixRequestDto));
    }

    @GetMapping
    public List<FixModel> getAll() {
        return fixRepository.findAll();
    }

//    @GetMapping
//    public Page<FixResponseDto> getPageable(Pageable pageable) {
//        return fixRepository.findAll(pageable).map(FixResponseDto::new);
//    }
}
