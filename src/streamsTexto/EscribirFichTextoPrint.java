package streamsTexto;

import java.io.*;

public class EscribirFichTextoPrint {

	public static void main(String[] args) {
		
		try {
			
			PrintWriter pw = new PrintWriter( new FileWriter("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt") );
			for( int i = 0; i < 11; i++ ) {
				pw.println("Filas números : " + i);
			}
			
			pw.close();
		
		} catch( FileNotFoundException fn ) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException io) {
			System.out.println("Error de E/S");
		}

	}

}
