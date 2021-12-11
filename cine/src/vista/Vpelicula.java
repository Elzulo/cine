package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Vpelicula {
	
	private String opcion;


	public void pintarMenu() {
		
		MarcoPeli marcoPelicula;
		
		marcoPelicula = new MarcoPeli();
		
		marcoPelicula.setVisible(true);
		
		marcoPelicula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		opcion = marcoPelicula.getOpcion();
		
	}
	
	public String getOpcion() {
		return opcion;
	}

}

class MarcoPeli extends JFrame implements ActionListener {
	
	

	private String opcion;
	  
	  private final String NUEVA = "nu";
	  private final String EDITAR = "ed";
	  private final String BORRAR = "bo";
	  private final String MOSTRAR = "mo";
	
	  private JMenuBar menuPelicula;
	  private JButton nueva;
	  private JButton editar;
	  private JButton borrar;
	  private JButton mostrar;
	  
	  public String getOpcion() {
			return opcion;
		}
	
	public MarcoPeli() {
		
		
		
		setResizable(true);
		setSize(500,550);
		setLocation(610,310);
		//Posicion y dimension
		//setBounds(600,300,500,500);
		//No resdimensionable
		//setResizable(false);
		//Extender ventana
		//setExtendedState(6 ó Frame.MAXIMIZED_BOTH);
		//Poner titulo
		setTitle("Videoclub");
		//Clase toolkit
		//getDefaultToolkit(), getScreenSize()
		
		
		
		  menuPelicula = new JMenuBar();
		
		setJMenuBar(menuPelicula);
		
		nueva = new JButton("Nueva");
		
		editar = new JButton("Editar");
		
		borrar = new JButton("Borrar");
		
		mostrar = new JButton("Mostrar");
		
		menuPelicula.add(nueva);
		nueva.addActionListener(this);
		menuPelicula.add(editar);
		editar.addActionListener(this);
		menuPelicula.add(borrar);
		borrar.addActionListener(this);
		menuPelicula.add(mostrar);
		mostrar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        if (e.getSource()==nueva) {
            opcion = NUEVA;
        }
        if (e.getSource()==editar) {
            opcion = EDITAR;
        }
        if (e.getSource()==borrar) {
            opcion = BORRAR;
        }
        if (e.getSource()==mostrar) {
            opcion = MOSTRAR;
        }
	}
}
