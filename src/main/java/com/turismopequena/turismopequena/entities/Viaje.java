package com.turismopequena.turismopequena.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="VIAJE")
public class Viaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=true)
	private Long id;
	
	@Column(name="id_destino")
	private int id_destino;
	
	@Column(name="fecha")
	private LocalDate fecha;
	
	@Column(name="no_asientos")
	private int no_asientos;
	
	@Column(name="observaciones")
	private String observaciones;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="viaje")
	private List<Destino> destino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNo_asientos() {
		return no_asientos;
	}

	public void setNo_asientos(int no_asientos) {
		this.no_asientos = no_asientos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Destino> getDestino() {
		return destino;
	}

	public void setDestino(List<Destino> destino) {
		this.destino = destino;
	}
	
	
}
