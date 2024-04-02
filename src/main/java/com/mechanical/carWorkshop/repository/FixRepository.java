package com.mechanical.carWorkshop.repository;

import com.mechanical.carWorkshop.model.FixModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixRepository extends JpaRepository<FixModel, Long> {
}
