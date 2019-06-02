package com.acing.iu;

import java.awt.Component;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import com.acing.Proyecto;


public class TablaProyectos extends JTable {
	
public TablaProyectos(Collection<Proyecto> proyectos) {
		
		Vector<String> nombresColumna = new Vector<>();
		nombresColumna.add("Titulo");
		nombresColumna.add("Descripcion Corta");
		nombresColumna.add("Curso");
		nombresColumna.add("Estado");
		Vector<Vector<Object>> datos = new Vector<>();
		Vector<Object> fila;
		for(Proyecto p : proyectos) {
			fila = new Vector<>();
			fila.add(p);
			fila.add(p.getDescripcionCorta());
			fila.add(p.getCurso().toString());
			fila.add(p.getEstado());
			datos.add(fila);
		}
		
		DefaultTableModel modelo = new DefaultTableModel(datos, nombresColumna) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return (columnIndex == 0) ? Proyecto.class : super.getColumnClass(columnIndex);
			}
		};
		setModel(modelo);
		
		//Formateo de columnas
		int indiceLocal = modelo.findColumn("Titulo");
		getColumnModel().getColumn(indiceLocal).setPreferredWidth(50);
		getColumnModel().getColumn(1).setPreferredWidth(200);
		getColumnModel().getColumn(modelo.findColumn("Curso")).setPreferredWidth(20);
		getColumnModel().getColumn(modelo.findColumn("Estado")).setPreferredWidth(20);
		
		//Render de celdas
		TableCellRenderer render = new TableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				return new JLabel(((Proyecto)value).getTitulo().toString());
			}
		};

		setDefaultRenderer(Proyecto.class, render);
		
	}
	
	public void mostrarProyectos(Collection<? extends Proyecto> partidos) {
		
	}

}
