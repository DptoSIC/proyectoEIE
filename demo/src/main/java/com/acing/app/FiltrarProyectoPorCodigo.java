package com.acing.app;


import java.util.List;

import javax.swing.JFrame;

import com.acing.Proyecto;
import com.acing.proyectoDAOMock;
import com.acing.iu.FiltradoProyectos;


public class FiltrarProyectoPorCodigo {

	public static void main(String[] args) {
		
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
		
//		List<Proyecto> listaProyectos = proyectosMock.findAll();
//	
//		JFrame prueba2 = new FiltradoProyectos(listaProyectos);
//		((FiltradoProyectos) prueba2).filtrarCodigo(26);
//		prueba2.setVisible(true);
			
		List<Proyecto> listaFiltrada = proyectosMock.filtrarPorCodigo(12);
		listaFiltrada
		.forEach(p -> System.out.println(p.toString()));
	}

}

