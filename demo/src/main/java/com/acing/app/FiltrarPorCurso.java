package com.acing.app;

import java.util.List;

import com.acing.Proyecto;
import com.acing.proyectoDAOMock;

public class FiltrarPorCurso {

	public static void main(String[] args) {
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
		
		List<Proyecto> listaFiltrada = proyectosMock.filtrarPorCurso("NBQ40");
		listaFiltrada
		.forEach(p -> System.out.println(p.toString()));

	}

}
