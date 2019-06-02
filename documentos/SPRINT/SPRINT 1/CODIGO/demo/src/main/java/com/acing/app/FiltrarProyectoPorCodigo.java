package com.acing.app;


import javax.swing.JFrame;


import com.acing.proyectoDAOMock;
import com.acing.iu.FiltradoProyectos;


public class FiltrarProyectoPorCodigo {

	public static void main(String[] args) {
		
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
	
		JFrame prueba2 = new FiltradoProyectos(proyectosMock.findAll());
		((FiltradoProyectos) prueba2).filtrarCodigo(5);
		prueba2.setVisible(true);
			

	}

}
