package com.mechanical.carWorkshop.repository;

import com.mechanical.carWorkshop.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel, Long> {
}
