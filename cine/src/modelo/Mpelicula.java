package modelo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import biblioteca.Conexion;

public class Mpelicula {
	
	private int codigoPeli;
	private String tituloPeli;
	private String annoPeli;
	private BigDecimal calificacionPeli;
	private String temaPeli;
	private String directorPeli;
	
	Connection con;
	
	Conexion conexion;
	/**
	 * Función que inserta una nueva fila en la base de datos
	 * 
	 */
	public void nuevoRegistroPelicula() {
		
		try {
			//con = DriverManager.getConnection("jdbc:postgresql://ns3034756.ip-91-121-81.eu/a21_abarfe", "a21_abarfe", "a21_abarfe");
			conexion = new Conexion();
			
			con = (Connection) conexion;
			PreparedStatement prstmt;
			

			prstmt = con.prepareStatement("insert into cine.pelicula(codigo, titulo, anno, calificacion, tema, director) values (?,?,?,?,?,?)");
			
			prstmt.setInt(1, codigoPeli);
			prstmt.setString(2, tituloPeli);
			prstmt.setString(3, annoPeli);
			prstmt.setBigDecimal(4, calificacionPeli);
			prstmt.setString(5, temaPeli);
			prstmt.setString(6, directorPeli);
			prstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public int getCodigoPeli() {
		return codigoPeli;
	}

	public String getTituloPeli() {
		return tituloPeli;
	}

	public String getAnnoPeli() {
		return annoPeli;
	}

	public BigDecimal getCalificacionPeli() {
		return calificacionPeli;
	}

	public String getTemaPeli() {
		return temaPeli;
	}

	public String getDirectorPeli() {
		return directorPeli;
	}

	public void setCodigoPeli(int codigoPeli) {
		this.codigoPeli = codigoPeli;
	}

	public void setTituloPeli(String tituloPeli) {
		this.tituloPeli = tituloPeli;
	}

	public void setAnnoPeli(String annoPeli) {
		this.annoPeli = annoPeli;
	}

	public void setCalificacionPeli(BigDecimal calificacionPeli) {
		this.calificacionPeli = calificacionPeli;
	}

	public void setTemaPeli(String temaPeli) {
		this.temaPeli = temaPeli;
	}

	public void setDirectorPeli(String directorPeli) {
		this.directorPeli = directorPeli;
	}
	
}
