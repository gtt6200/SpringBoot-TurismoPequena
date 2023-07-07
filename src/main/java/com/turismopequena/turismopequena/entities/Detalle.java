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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=true)
	private Long id;
	
	@JoinColumn(name="id_viaje")
	private int id_viaje;
	
	@JoinColumn(name="id_cliente")
	private int id_cliente;
	
	@JoinColumn(name="id_usuario")
	private int id_usuario;
	
	@Column(name="anticipo")
	private double anticipo;
	
	@Column(name="fecha_venta")
	@Temporal(TemporalType.DATE)
	private LocalDate fecha_venta;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="cliente")
	private List<Cliente> cliente;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="viaje")
	private List<Viaje> viaje;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="usuario")
	private List<Usuario> usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public double getAnticipo() {
		return anticipo;
	}

	public void setAnticipo(double anticipo) {
		this.anticipo = anticipo;
	}

	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Viaje> getViaje() {
		return viaje;
	}

	public void setViaje(List<Viaje> viaje) {
		this.viaje = viaje;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
}
