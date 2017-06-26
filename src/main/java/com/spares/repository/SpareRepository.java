package com.spares.repository;

import com.spares.entity.Spare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpareRepository extends JpaRepository<Spare, Long> {

}
