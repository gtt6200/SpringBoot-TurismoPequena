package com.turismopequena.turismopequena.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turismopequena.turismopequena.entities.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long>{

	Optional<Detalle> findById(Long id);
	
}
