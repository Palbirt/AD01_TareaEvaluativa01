package streamsTexto;

import java.io.*;

public class EscribirFichTexto {

	public static void main(String[] args) throws IOException {
		 
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\UD02\\fichero1.txt"); // declarar fichero
		FileWriter fic = new FileWriter(fichero);
		String cadena = "Esto es una prueba con FileWriter";
		char[] cad = cadena.toCharArray();
		
		for( int i = 0; i < cad.length; i++ ) {
			fic.write(cad[i]); // se va escribiendo un caracter
		}
		fic.append('*');
		
		
		fic.write("\n");
		fic.write(cad); // escribir un array de caracteres
		String c = "\n*esto es lo íltimo";
		fic.write(c);
		
		
		String prov[] = {"Albacete", "Avila", "Badajoz" };
		fic.write("\n");
		for( int i = 0; i < prov.length; i++ ) {
			fic.write( prov[i] );
			fic.write("\n");
		}
		
		
		fic.close();

	}

}
