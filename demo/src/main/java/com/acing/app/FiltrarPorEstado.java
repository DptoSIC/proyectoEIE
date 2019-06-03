package com.acing.app;

import java.util.List;

import com.acing.Estado;
import com.acing.Proyecto;
import com.acing.proyectoDAOMock;

public class FiltrarPorEstado {

	public static void main(String[] args) {
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
		List<Proyecto> listaFiltrada = proyectosMock.filtrarPorEstado(Estado.CERRADO);
		listaFiltrada
		.forEach(p -> System.out.println(p.toString()));

	}

}
