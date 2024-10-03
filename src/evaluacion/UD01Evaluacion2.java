package evaluacion;

import java.io.*;
public class UD01Evaluacion2 {

	public static void main(String[] args) {

	
	    try  {
	    	
	    	BufferedReader br = new BufferedReader( new FileReader("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\ejercicio2Leer.txt") );
		    BufferedWriter bw = new BufferedWriter( new FileWriter("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\ejercicio2Escribir.txt") );
	
	        String line;
	        // Leer cada línea del archivo de entrada
	        while ( (line = br.readLine()) != null ) {
	            String[] palabras = line.split(" "); // Separar por espacios
	
	            // Filtrar nombres de cinco letras
	            
	            //for (String palabras[0]) {
	                if ( palabras[0].length() == 5 ) {
	                    bw.write( palabras[0] ); // Escribir el nombre en el archivo de salida
	                    bw.newLine();       // Añadir salto de línea
	                    System.out.println( palabras[0] );
	                }
	            // }
	        }
	        
	        System.out.println( "Proceso completado correctamente." );
	        
	        br.close();
	        bw.close();
	        
	    } catch (IOException e) {
	        System.err.println( "Error al procesar el archivo: " + e.getMessage() );
	    }
	}
	

}

