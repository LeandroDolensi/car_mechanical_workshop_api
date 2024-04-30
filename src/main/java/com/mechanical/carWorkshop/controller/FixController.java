package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.FixRequestDto;
import com.mechanical.carWorkshop.dto.FixResponseDto;
import com.mechanical.carWorkshop.model.FixModel;
import com.mechanical.carWorkshop.repository.FixRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @RequestMapping("simple")
    public List<FixResponseDto> getAll() {
        return fixRepository.findAllByAtivoTrue().stream().map(FixResponseDto::new).toList();
    }

    @GetMapping
    public Page<FixModel> getPageable(Pageable pageable) {
        return fixRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FixModel> getFixById(@PathVariable Long id) {
        Optional<FixModel> fixOptional = fixRepository.findById(id);
        if (fixOptional.isPresent()) {
            FixModel fix = fixOptional.get();
            return ResponseEntity.ok(fix);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        FixModel fix = fixRepository.getReferenceById(id);
        fix.excluir();
    }
}
