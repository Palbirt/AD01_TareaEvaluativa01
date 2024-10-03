package file;

import java.io.*;

public class CrearDiv {

	public static void main(String[] args) {
		File d = new File("NUEVODIR");
		File f1 = new File(d, "FICHERO1.txt");
		File f2 = new File(d, "FICHERO2.txt");
		
		d.mkdir(); // CREAR DIRECTORIO
		
		try {
			
			if( f1.createNewFile() ) {
				System.out.println("FICHERO1 creado correctamente...");
			} else {
				System.out.println("No se ha podido crear FICHERO1...");
			}
			
			if( f2.createNewFile() ) {
				System.out.println("FICHERO2 creado correctamente...");
			} else {
				System.out.println("No se ha podido crear FICHERO2...");
			}
			
		} catch (IOException ioe ){
			ioe.printStackTrace();
		}
		
		f1.renameTo(new File(d, "FICHERO1NUEVO")); // renombro FICHERO1
		
		try {
			
			File f3 = new File("NUEVODIR/FICHERO3.txt");
			f3.createNewFile(); // crea FICHERO 3 en NUEVODIR
			
		} catch (IOException ioe ){
			ioe.printStackTrace();
		}

	}

}
