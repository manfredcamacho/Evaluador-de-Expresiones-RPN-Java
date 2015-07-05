package principal;

import entradaSalida.Entrada;
import entradaSalida.Salida;

public class Principal {

	public static void main(String[] args) {
		Entrada entrada = new Entrada("lote/funcion_02.in");
		Salida salida = new Salida("lote/funcion_02.out");
		
		/** Lee todos los datos desde archivo**/
		String expresionRPN = entrada.leer();
		String lineaAux[] = entrada.leer().split(" ");
		int cantidadVariables = Integer.parseInt(lineaAux[0]);
		int cantidadValores = Integer.parseInt(lineaAux[1]);
		double valores[][] = new double[cantidadValores][cantidadVariables];
		
		for (int i = 0; i < cantidadValores; i++) {
			lineaAux = entrada.leer().split(" ");
			for (int j = 0; j < cantidadVariables; j++) {
				valores[i][j] = Double.parseDouble(lineaAux[j]);
			}
		}
		
		entrada.cerrar();
		/**  Fin de lectura de datos**/
		
		/**  Escritura de datos en archivo**/
		Funcion f = new Funcion(expresionRPN);
		salida.escribir(Integer.toString(cantidadValores));
		
		for (int i = 0; i < cantidadValores; i++) {
			salida.escribir(Double.toString(f.evaluar(valores[i])));
		}
		
		salida.cerrar();
		/**  Fin escritura de datos**/
		
		System.out.println("Programa finalizado");
	}
	
}
