package com.acing.iu;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.Locale;
import javax.swing.JScrollPane;
import com.acing.Proyecto;
import com.acing.proyectoDAOMock;
import com.esotericsoftware.tablelayout.Value;
import com.esotericsoftware.tablelayout.swing.Table;


public class ProyectosFrame extends JFrame{
	
	private JLabel lbl_Proyecto;

	public ProyectosFrame() {
		super();
		initialize();
	}
	
	public static void main(String... args) {
		JFrame prueba = new ProyectosFrame();
		prueba.setVisible(true);
	}
	
	private void initialize() {
		setName("Proyecto");
        setLocale(new Locale("es", "ES"));
        setMinimumSize(new Dimension(500, 600));
        //Establece el tama�o
        setBounds(100, 100, 1100, 400);
        
        setTitle("Proyectos");
        
      //Para que termine la ejecucion al cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
      //Componentes
      lbl_Proyecto = new JLabel("Proyecto");
      lbl_Proyecto.setFont(new Font("Arial", Font.BOLD, 20));
      
    //Layout (configuracion general)
      Table tabla = new Table();
      Value padding = new Value.FixedValue(5);
      tabla.top().left().pad(padding);
      tabla.defaults().pad(padding).left();
      getContentPane().add(tabla);
      
      //Modo debug (se ven los bordes del layout)
//      tabla.debug(Debug.all);
      
      List<Proyecto> proyectos= new proyectoDAOMock().findAll();
      
      //Agregar los componentes
 //     tabla.addCell(lbl_Proyecto).center().fill();
      
      mostrarProyecto((Proyecto) ((List<Proyecto>)proyectos).get(0));
      
      TablaProyectos tablaProyectos = new TablaProyectos(proyectos);
      tablaProyectos.getSelectionModel().addListSelectionListener(e -> 
      		mostrarProyecto((Proyecto) tablaProyectos.getValueAt(tablaProyectos.getSelectedRow(), 0)));
      
      @SuppressWarnings("unchecked")
	SimpleJTable<Proyecto> listaSimple = new SimpleJTable<Proyecto>(
              proyectos,
              new String[] { "Título", "Descripcion Corta", "Curso", "Estado" },
              p -> p.getTitulo(),
              p -> p.getDescripcionCorta(),
              p -> p.getCurso().toString(),
              p -> p.getEstado()) {
    	  @Override
    	  protected void cambiaLaTabla(Object obj) {

    		  setTitle("Proyectos(" + proyectos.size() + ")");
    	  };
      };
      
      listaSimple.setAnchosPreferidos(200, 200, 20, 200);
      
    
      JScrollPane scPanel = new JScrollPane(listaSimple);
      tabla.row();
      tabla.addCell(scPanel).expand().fill();

	}

	public void mostrarProyecto(Proyecto proyecto) {
		lbl_Proyecto.setText(proyecto.toString());
	}
	

}
