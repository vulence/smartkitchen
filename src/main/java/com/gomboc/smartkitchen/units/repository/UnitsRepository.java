package com.gomboc.smartkitchen.units.repository;

import com.gomboc.smartkitchen.units.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitsRepository extends JpaRepository<Unit, Long> {
}
