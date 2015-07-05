package entradaSalida;

import java.io.*;

public class Salida {

	private FileWriter fw = null;
	private PrintWriter pw = null;
	
	public Salida( String ruta ){
		try {
			fw = new FileWriter(ruta);
			pw = new PrintWriter(fw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrar(){
		try {
			if( fw != null )
				fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void escribir( String linea ){
		try {
			pw.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}