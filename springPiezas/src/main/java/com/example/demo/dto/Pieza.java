package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pieza")
public class Pieza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	
	@OneToMany
    @JoinColumn(name = "codigo_pieza")
	@JsonIgnore
	private List<Suministra> suministros;
	
	public Pieza() {
		
	}

	public Pieza(int codigo, String nombre, List<Suministra> suministros) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministros = suministros;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Suministra> getSuministros() {
		return suministros;
	}

	public void setSuministros(List<Suministra> suministros) {
		this.suministros = suministros;
	}
}
