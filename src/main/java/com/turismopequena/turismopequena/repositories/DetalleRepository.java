package com.turismopequena.turismopequena.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turismopequena.turismopequena.entities.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long>{

	Optional<Detalle> findById(Long id);
	
	Optional<Detalle> findById_usuario(int id_usuario);
	
	@Query("SELECT * FROM detalle")
	public List<Detalle> findDetalle();
	
	@Modifying
	@Query("UPDATE detalle SET anticipo = ? WHERE detalle.id = ?; ")
	void updateAnticipoById(Double anticipo, Long id);
	
}
