package com.acing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {
	
	@Id 
	@GeneratedValue 
	private int idCurso;
	private TipoCurso tipoCurso;
	private String edicion;
	private String anno;
	
	public Curso(TipoCurso tipoCurso, String edicion, String anno) {
		super();
		this.tipoCurso =tipoCurso;
		this.edicion = edicion;
		this.anno = anno;
	}	
	
	
	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}


	public String getEdicion() {
		return edicion;
	}


	public String getAnno() {
		return anno;
	}


	@Override
	public String toString() {
		return tipoCurso.getNombreCurso() + "" + edicion;
	}
	
	
	
	

}
