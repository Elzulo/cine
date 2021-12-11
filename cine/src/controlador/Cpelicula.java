package controlador;

import vista.Vpelicula;

public class Cpelicula {

	public static void main(String[] args) {
		
		Cpelicula cPelicula;
		
		cPelicula = new Cpelicula();
		
		cPelicula.run();
	}

	public void run() {
		
		Vpelicula vPelicula;
		Cnueva cNueva;
		
		String opcion;
		
		vPelicula = new Vpelicula();
		
		vPelicula.pintarMenu();
	
// TODO terminar opciones
		do {
			opcion = vPelicula.getOpcion();
			
			if(opcion == null) {
				
				
			} else {
				
				if(opcion.equals("nu")) {
					
					cNueva = new Cnueva();
					
					cNueva.run();
				}
			}
			
		}while(opcion == null);
		
		System.out.println(opcion);
	}

}
