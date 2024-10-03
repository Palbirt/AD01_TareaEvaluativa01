package streamsTexto;

import java.io.*;

public class LeerFichTextoBuf {

	public static void main(String[] args) {

		try {
			
			//File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt"); // declarar fichero
			BufferedReader br = new BufferedReader( new FileReader("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt") );
			
			String linea;
			while( (linea = br.readLine()) != null )
				System.out.println( linea );
			
			br.close();
			
			
		} catch( FileNotFoundException fn ) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException io) {
			System.out.println("Error de E/S");
		}
		

	}

}
