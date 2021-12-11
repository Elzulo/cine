package controlador;

import controlador.Cprincipal;
import vista.Vprincipal;

public class Cprincipal {

	public static void main(String[] args) {
		
		Cprincipal cPrincipal;
		
		
		cPrincipal = new Cprincipal();
		
		cPrincipal.run();
	}

	private void run() {
		
		Vprincipal vPrincipal;
		Cpelicula cPelicula;
		
		String opcion;
		
		vPrincipal = new Vprincipal();
		
		vPrincipal.pintarMenu();
		
		
		
// TODO terminar opciones
		
		do {
			opcion = vPrincipal.getOpcion();
			
			if(opcion == null) {
				
				
			} else {
				
				if(opcion.equals("pe")) {
					
					cPelicula = new Cpelicula();
					
					cPelicula.run();
				}
			}
			
		}while(opcion == null);
		
		System.out.println(opcion);
		
		
	}

}
