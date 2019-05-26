package com.acing.iu;

import java.awt.Dimension;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.acing.Proyecto;
import com.acing.app.FiltrarProyectoPorCodigo;
import com.esotericsoftware.tablelayout.Value;
import com.esotericsoftware.tablelayout.swing.Table;

public class FiltradoProyectos extends JFrame{
	
	private JComboBox cb_VariosTipos;
	private JCheckBox ckb_ParaAlgo;
	private JTextField txt_Output;
	
	List<Proyecto> proyectos;

	public FiltradoProyectos(List<Proyecto> proyectos) {
		super();
		this.proyectos = proyectos;
		initialize();
	}
	
	public void filtrarCodigo(int codigo) {
		txt_Output.setText(proyectos.get(codigo).toString());
	}
	
	public static void main(String... args) {
		JFrame prueba = new FiltradoProyectos(null);
		prueba.setVisible(true);
	}
	
	private void initialize() {
		setName("Busqueda de Proyectos");
        setLocale(new Locale("es", "ES"));
        setMinimumSize(new Dimension(500, 600));
        //Establece el tama�o
        setBounds(100, 100, 1100, 400);
        
        setTitle("Filtro de Proyectos");
        
      //Para que termine la ejecucion al cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
  
      //Componentes
      JLabel codigo = new JLabel("Código Proyecto");
      JLabel titulo = new JLabel("Título Proyecto");
      JLabel desCorta = new JLabel("Descripción Corta");
      JLabel curso= new JLabel("Curso");
      JLabel estado = new JLabel("Estado");
      JButton btn_1 = new JButton("Filtrar");

      JComboBox<Object> cb_Codigo = new JComboBox<Object>(proyectos
    		  	.stream()
    		  	.map(e -> e.getIdProyecto()).collect(Collectors.toList()).toArray());
      
      JComboBox<Object> cb_Titulo = new JComboBox<Object>(proyectos
  		  	.stream()
  		  	.map(e -> e.getTitulo().toString()).collect(Collectors.toList()).toArray());
      
      JComboBox<Object> cb_Curso = new JComboBox<Object>(proyectos
    		  	.stream()
    		  	.map(e -> e.getCurso().toString()).collect(Collectors.toList()).toArray());
      
      //Acceso desde otro scope
      cb_VariosTipos = new JComboBox<>(new Object[]{ "Primero", 2, true });
      ckb_ParaAlgo = new JCheckBox("Es Algo (label CheckBox)");
      txt_Output = new JTextField();
      
      cb_Codigo.addActionListener(l -> 
      			txt_Output.setText(proyectos.get((int) cb_Codigo.getSelectedItem()).toString()));
      
      
    //Layout (configuracion general)
      Table tabla = new Table();
      Value padding = new Value.FixedValue(5);
      tabla.top().left().pad(padding);
      tabla.defaults().pad(padding).left();

      tabla.columnDefaults(2).expandX();
      getContentPane().add(tabla);
      
      //Tamanhos
      Value anchoCombos = new Value.FixedValue(200);
      

      //Agregar los componentes
      tabla.addCell(codigo);
    

      tabla.row();
      
      tabla.addCell(cb_Codigo);



      tabla.row();
      tabla.addCell(txt_Output).width(800);
	}


}
