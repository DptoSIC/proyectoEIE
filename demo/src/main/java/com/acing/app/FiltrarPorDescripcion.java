package com.acing.app;

import java.util.List;

import com.acing.Proyecto;
import com.acing.proyectoDAOMock;

public class FiltrarPorDescripcion {

	public static void main(String[] args) {
	
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
		
		List<Proyecto> listaFiltrada = proyectosMock.filtrarPorDescripcion("Proyecto DIM sobre... ");
		listaFiltrada
		.forEach(p -> System.out.println(p.toString()));

	}

}
