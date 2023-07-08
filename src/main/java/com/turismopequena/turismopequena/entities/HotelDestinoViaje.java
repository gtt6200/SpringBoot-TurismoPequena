package com.turismopequena.turismopequena.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="HOTEL_DESTINO_VIAJE")
public class HotelDestinoViaje {
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
    private int habitaciones_disponibles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hotel", insertable = false, updatable = false)
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_destino", insertable = false, updatable = false)
    private Destino destino;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_viaje", insertable = false, updatable = false)
    private Viaje viaje;

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

    public int getHabitaciones_disponibles() {
        return habitaciones_disponibles;
    }

    public void setHabitaciones_disponibles(int habitaciones_disponibles) {
        this.habitaciones_disponibles = habitaciones_disponibles;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}