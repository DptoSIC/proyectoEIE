package com.acing;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Proyecto {

	@Id
	@GeneratedValue 
	private int idProyecto;
	private String titulo;
	private String descripcionCorta;

	private Curso curso;
	private Estado estado;
	

	public Proyecto() {
		super();
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public Curso getCurso() {
		return curso;
	}

	public Estado getEstado() {
		return estado;
	}	

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return  titulo + ", Descripcion: " + descripcionCorta
				+ ", Curso: " + curso.getTipoCurso().getNombreCurso()+ " "+ curso.getEdicion() + ", Estado: " + estado;
	}

	
	
}
