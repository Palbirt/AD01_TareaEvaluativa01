package streamsTexto;

import java.io.*;

public class LeerFicheroTexto {

	public static void main(String[] args) throws IOException {
		
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt"); // declarar fichero
		FileReader fic = new FileReader(fichero); // crear el flujo de entrada
		
		int i;
		
		while( (i = fic.read()) != -1 )
			System.out.print( (char) i );
		
		// para leer de 20 en 20 utilizamos el método read pasándole el buffer de carateres
		/*char b[] = new char[20];
		while ( (i = fic.read(b))  != -1 )
			System.out.println(b);*/
		
		//Syste.out.println( (char) i + "==>" + i );
		
		fic.close();
		
	}

}
