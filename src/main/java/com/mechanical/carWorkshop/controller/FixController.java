package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.FixCompleteResponseDto;
import com.mechanical.carWorkshop.dto.FixRequestDto;
import com.mechanical.carWorkshop.dto.FixSimpleResponseDto;
import com.mechanical.carWorkshop.dto.FixUpdateDto;
import com.mechanical.carWorkshop.model.FixModel;
import com.mechanical.carWorkshop.repository.FixRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("fix")
public class FixController {

    @Autowired
    private FixRepository fixRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<FixCompleteResponseDto> create(@RequestBody @Valid FixRequestDto fixRequestDto, UriComponentsBuilder uriBuilder){
        FixModel fix = new FixModel(fixRequestDto);
        fixRepository.save(fix);
        var uri = uriBuilder.path("/fix/{id}").buildAndExpand(fix.getId()).toUri();
        return ResponseEntity.created(uri).body( new FixCompleteResponseDto(fix) );
    }

    @GetMapping
    @RequestMapping("simple")
    public ResponseEntity<List<FixSimpleResponseDto>> getAll() {
        return ResponseEntity.ok(fixRepository.findAllByAtivoTrue().stream().map(FixSimpleResponseDto::new).toList());
    }

    @GetMapping
    public ResponseEntity<Page<FixModel>> getPageable(Pageable pageable) {
        return ResponseEntity.ok(fixRepository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<FixCompleteResponseDto> getFixById(@PathVariable Long id) {
        Optional<FixModel> fixOptional = fixRepository.findById(id);
        if (fixOptional.isPresent()) {
            FixModel fix = fixOptional.get();
            return ResponseEntity.ok(new FixCompleteResponseDto(fix));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    @Transactional
    public ResponseEntity<FixSimpleResponseDto> update(@RequestBody @Valid FixUpdateDto fixDto) {
        FixModel fix = fixRepository.getReferenceById(fixDto.id());
        fix.update(fixDto);

        return ResponseEntity.ok(new FixSimpleResponseDto(fix));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        FixModel fix = fixRepository.getReferenceById(id);
        fix.excluir();
        return ResponseEntity.noContent().build();
    }
}
