package com.turismopequena.turismopequena.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL_DESTINO_VIAJE")
public class HotelDestinoViaje {
//id 	id_hotel 	id_destino 	id_viaje 	no_habitaciones 	habitaciones_disponibles
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=true)
	private Long id;
	
	@JoinColumn(name="id_hotel")
	private int id_hotel;
	
	@JoinColumn(name="id_destino")
	private int id_destino;

	@JoinColumn(name="id_viaje")
	private int id_viaje;
	
	@Column(name="no_habitaciones")
	private int no_habitaciones;
	
	@Column(name="habitaciones_dispobibles")
	private int habitaciones_dispobibles;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="hotel")
	private List<Hotel> hotel;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="destino")
	private List<Destino> destino;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="viaje")
	private List<Viaje> viaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public int getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}

	public int getNo_habitaciones() {
		return no_habitaciones;
	}

	public void setNo_habitaciones(int no_habitaciones) {
		this.no_habitaciones = no_habitaciones;
	}

	public int getHabitaciones_dispobibles() {
		return habitaciones_dispobibles;
	}

	public void setHabitaciones_dispobibles(int habitaciones_dispobibles) {
		this.habitaciones_dispobibles = habitaciones_dispobibles;
	}

	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	public List<Destino> getDestino() {
		return destino;
	}

	public void setDestino(List<Destino> destino) {
		this.destino = destino;
	}

	public List<Viaje> getViaje() {
		return viaje;
	}

	public void setViaje(List<Viaje> viaje) {
		this.viaje = viaje;
	}
	
	
}
