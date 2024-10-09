package com.app.api.models;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="asegurado")
public class Asegurado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAsegurado;
	
	private int tipoIdentificacion;
	
	@Column
	private String numeroIdentificacion;
	
	@Column
	private String apellido;
	
	@Column
	private String nombre;
	
	private int sexo;
	
	@OneToMany(mappedBy = "asegurado")
	private List<Amparo> amparo;
	
	@Column
	private LocalDate fechaNacimiento;

	public long getIdAsegurado() {
		return idAsegurado;
	}

	public void setIdAsegurado(long idAsegurado) {
		this.idAsegurado = idAsegurado;
	}



	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public List<Amparo> getAmparo() {
		return amparo;
	}

	public void setAmparo(LinkedList<Amparo> amparo) {
		this.amparo = amparo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

    


}
