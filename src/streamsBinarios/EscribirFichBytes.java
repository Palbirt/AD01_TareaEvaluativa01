package streamsBinarios;

import java.io.*;

public class EscribirFichBytes {

	public static void main(String[] args) throws IOException {
		 
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichBytes.dat"); // declara fichero
		
		// crea flujo de salida hacia el fichero
		FileOutputStream fileout = new FileOutputStream(fichero, true);
		
		// crea flujo de entrada
		FileInputStream filein = new FileInputStream(fichero);
		
		int i;
		
		for( i = 1; i < 100; i++ ) {
			fileout.write(i); // escribe datos en el flujo de salida
		}
		fileout.close(); // cerrar stream de salida
				
		
		// visualizar datos del fichero
		while( (i = filein.read() ) != -1 ) {
			System.out.println(i);
		}
		filein.close();

	}

}
