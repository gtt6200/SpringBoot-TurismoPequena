package com.turismopequena.turismopequena.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hotel_destino")
public class HotelDestino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="id_hotel", unique=true, nullable=true)
	private Long id_hotel;
	
	@JoinColumn(name="id_destino")
	private int id_destino;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="destino")
	private List<Destino> Destino;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="hotel")
	private List<Hotel> hotel;

	public Long getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(Long id_hotel) {
		this.id_hotel = id_hotel;
	}

	public int getId_destino() {
		return id_destino;
	}

	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}

	public List<Destino> getDestino() {
		return Destino;
	}

	public void setDestino(List<Destino> destino) {
		Destino = destino;
	}

	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}
	
	

}
