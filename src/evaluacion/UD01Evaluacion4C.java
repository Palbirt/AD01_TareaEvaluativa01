package evaluacion;

import java.io.*;
import java.util.Scanner;

public class UD01Evaluacion4C {

	public static void main(String[] args) throws IOException{

		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\Marvel.dat");
		
		
		// Obtener los datos por teclado
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca el tipo de personaje (heroe/villano): ");
        String tipo = scanner.nextLine();
        
        
		
		// declara el fichero de acceso aleatorio
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		boolean encontrado = false;
		@SuppressWarnings("unused")
		int id, peso = 0, altura, posicion;
		char[] dniP = new char[9];
		char[] nombreP = new char[10];
		char[] identidadP = new char[20];
		char[] tipoP = new char[10];
		String tipop = "";
		int cantidad = 0;
		String respuesta = "";
		
		char aux;
		
		posicion = 0; // para situarnos al principio
		
		try {
		while ( file.getFilePointer() != file.length() ) {
			
			
			file.seek(posicion); // nos posicionamos en posicion
			id = file.readInt(); // obtengo el id del personaje
			
			// DNI
			for ( int i = 0; i < dniP.length; i++ ) {
				aux = file.readChar();
				dniP[i] = aux; // los voy guardando en el array
			}
			
			String dnip = new String( dniP );
			
			// NOMBRE
			for ( int i = 0; i < nombreP.length; i++ ) {
				aux = file.readChar();
				nombreP[i] = aux; // los voy guardando en el array
			}
			
			String nombrep = new String( nombreP );
			
			// IDENTIDAD SECRETA
			for ( int i = 0; i < identidadP.length; i++ ) {
				aux = file.readChar();
				identidadP[i] = aux; // los voy guardando en el array
			}
			
			String identidadp = new String( identidadP );
			
			// TIPO PERSONAJE
			for ( int i = 0; i < tipoP.length; i++ ) {
				aux = file.readChar();
				tipoP[i] = aux; // los voy guardando en el array
			}
			
			tipop = new String( tipoP );
			
			peso = file.readInt(); 
			altura = file.readInt(); 
			
			
			/*if( id > 0 ) {
				System.out.printf("ID: %s, DNI: %s, NOMBRE: %s, IDENTIDAD SECRETA: %s, TIPO: %s, PESO: %s, ALTURA: %s %n", id, dnip.trim(), nombrep.trim(), identidadp.trim(), tipop.trim(), peso, altura);
			}*/
			
			
			// Controlar si el tipo coincide
			if( tipo.equals(tipop.trim()) ) {
				encontrado = true;
				cantidad += 1;
				// System.out.printf("ID: %s, DNI: %s, NOMBRE: %s, IDENTIDAD SECRETA: %s, TIPO: %s, PESO: %s, ALTURA: %s %n", id, dnip.trim(), nombrep.trim(), identidadp.trim(), tipop.trim(), peso, altura);
				respuesta += "Personaje [dni=" + dnip + " nombre=" + nombrep + " identidad=" + identidadp + " tipo=" + tipop + " peso=" + peso + " altura=" + altura + "]\n";
			} 
			
			
			// me posiciono para el siguiente empleado, cada personaje ocupa 110 bytes
			posicion = posicion + 110;
			
		}
		} catch (IOException io) {
			System.err.println( "Se ha producido un error al cargar el archivo: " + io.getMessage() );
        }
		
		file.close();
		
		
		if ( encontrado ) {
			System.out.println("Se han encontrado " + cantidad + " " + tipo + "s.");
			System.out.println(respuesta);
		} else {
			System.out.println("No existen " + tipo + "s en el fichero.");
		}
		

	}

}
