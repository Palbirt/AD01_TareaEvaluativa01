package streamsTexto;

import java.io.*;

public class EscribirFichTextoBuf {

	public static void main(String[] args) {
		 
		try {
		
			BufferedWriter bw = new BufferedWriter( new FileWriter("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt") );
			for ( int i = 0; i < 11; i++ ) {
				bw.write("Fila número: " + i);
				bw.newLine();
			}
			
			bw.close();
		
		} catch( FileNotFoundException fn ) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException io) {
			System.out.println("Error de E/S");
		}

	}

}
