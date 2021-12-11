package vista;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*
 * Vista Principal
 * 
 * -
 */
public class Vprincipal {
	
	private static String opcion;


	public String pintarMenu() {
		
		Marco marcoPrincipal;
		
		marcoPrincipal = new Marco();
		
		marcoPrincipal.setVisible(true);
		
		marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		opcion = marcoPrincipal.getOpcion();
		System.out.println(opcion);
		
		return opcion;
	}
	
	public String getOpcion() {
		return opcion;
	}

}

class Marco extends JFrame implements ActionListener {
	
	

	private String opcion;
	  
	  private final String PELICULA = "pe";
	  private final String TEMA = "te";
	  private final String DIRECTOR = "dir";
	  private final String SOCIO = "so";
	  private final String DISTRIBUIDOR = "dis";
	  private final String ALQUILER = "al";
	
	  private JMenuBar menuPrincipal;
	  private JButton pelicula;
	  private JButton tema;
	  private JButton director;
	  private JButton socio;
	  private JButton distribuidor;
	  private JButton alquiler;
	  
	  private JMenuItem pe1,pe2,pe3,pe4;
	  private JMenuItem te1,te2,te3,te4;
	  private JMenuItem dir1,dir2,dir3,dir4;
	  private JMenuItem dis1,dis2,dis3,dis4;
	  private JMenuItem so1,so2,so3,so4;
	  private JMenuItem al1,al2,al3,al4;
	  
	  public String getOpcion() {
			return opcion;
		}
	
	public Marco() {
		
		
		
		setResizable(true);
		setSize(600,500);
		setLocation(600,300);
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
		
		
		
		  menuPrincipal = new JMenuBar();
		
		setJMenuBar(menuPrincipal);
		
		pelicula = new JButton("Peliculas");
		
		tema = new JButton("Temas");
		
		director = new JButton("Director");
		
		socio = new JButton("Socio");
		
		distribuidor = new JButton("Distribuidor");
		
		alquiler = new JButton("Alquiler");
		
		menuPrincipal.add(pelicula);
		pelicula.addActionListener(this);
		menuPrincipal.add(tema);
		tema.addActionListener(this);
		menuPrincipal.add(director);
		director.addActionListener(this);
		menuPrincipal.add(socio);
		socio.addActionListener(this);
		menuPrincipal.add(distribuidor);
		distribuidor.addActionListener(this);
		menuPrincipal.add(alquiler);
		alquiler.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        if (e.getSource()==pelicula) {
            opcion = PELICULA;
        }
        if (e.getSource()==tema) {
            opcion = TEMA;
        }
        if (e.getSource()==director) {
            opcion = DIRECTOR;
        }
        if (e.getSource()==socio) {
            opcion = SOCIO;
        } 
        if (e.getSource()==distribuidor) {
            opcion = DISTRIBUIDOR;
        } 
        if (e.getSource()==alquiler) {
            opcion = ALQUILER;
        }
	}
}