package evaluacion;

import java.io.*;

public class UD01Evaluacion1 {
	
public static void main(String[] args) throws IOException {
		
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\ejercicio1.txt"); // declarar fichero
		FileReader fr = new FileReader(fichero); // crear el flujo de entrada
		
		int i;
		StringBuilder fraseReverso = new StringBuilder();
		StringBuilder aux = new StringBuilder();
		
		while( (i = fr.read()) != -1 ) {
			
			if( ( i != 32 && i != 10) ) {
				
				aux.append( (char) i); // Añado la letra al string auxiliar
				
			} else {
				
				// Hago el reverso de la palabra y lo añado a la respuesta final
				fraseReverso.append( aux.reverse().toString() );
				// Añado el espacio
				fraseReverso.append( (char) i);
				// Vacío el string auxiliar
				aux.setLength(0);
				
			}
			
		}
		
		// Procesar la última palabra si no termina en un espacio o salto de línea
        if (aux.length() > 0) {
        	fraseReverso.append( aux.reverse().toString() );
        }
		
		
		String resultado = fraseReverso.toString(); // Convierte a String
		System.out.printf("Resultado final: " + resultado);
		
		fr.close();
		
		// ESCRIBIR EL FICHERO
		FileWriter fw = new FileWriter(fichero);
		fw.write( resultado );
		
		fw.close();
		
	}

}


