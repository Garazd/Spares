package com.spares.repository;

import com.spares.entity.Spares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparesRepository extends JpaRepository<Spares, Long> {

}
