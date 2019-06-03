package com.acing;

public class ProyectoDIM extends Proyecto{
	
	private String paradigma;
	private String lenguajeDesarrollo;
	
	public ProyectoDIM() {
		super();
	}
	
	public ProyectoDIM(String paradigma, String lenguajeDesarrollo) {
		super();
		this.paradigma = paradigma;
		this.lenguajeDesarrollo = lenguajeDesarrollo;
	}

	public String getParadigma() {
		return paradigma;
	}

	public void setParadigma(String paradigma) {
		this.paradigma = paradigma;
	}

	public String getLenguajeDesarrollo() {
		return lenguajeDesarrollo;
	}

	public void setLenguajeDesarrollo(String lenguajeDesarrollo) {
		this.lenguajeDesarrollo = lenguajeDesarrollo;
	}

	@Override
	public String toString() {
		return super.toString()+" "+paradigma + " " + lenguajeDesarrollo;
	}
	

}
