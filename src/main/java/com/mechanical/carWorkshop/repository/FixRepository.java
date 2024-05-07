package com.mechanical.carWorkshop.repository;

import com.mechanical.carWorkshop.model.FixModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FixRepository extends JpaRepository<FixModel, Long> {
    List<FixModel> findAllByAtivoTrue();
}
