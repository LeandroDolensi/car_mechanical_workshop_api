package com.mechanical.carWorkshop.repository;

import com.mechanical.carWorkshop.model.MechanicModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MechanicRepository extends JpaRepository<MechanicModel, Long> {
}
