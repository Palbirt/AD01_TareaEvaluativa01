package accesoAleatorio;

import java.io.*;

public class LeerFichAleatorio {

	public static void main(String[] args) throws IOException {

		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\accesoAleatorio\\AleatorioEmple.dat");
		
		// declara el fichero de acceso aleatorio
		RandomAccessFile file = new RandomAccessFile(fichero, "r");
		
		int id, dep, posicion;
		Double salario;
		char[] apellido = new char[10];
		char aux;
		
		posicion = 0; // para situarnos al principio
		
		while ( file.getFilePointer() != file.length() ) {
			file.seek(posicion); // nos posicionamos en posicion
			id = file.readInt(); // obtengo el id del empleado
			
			// recorro uno a uno los caracteres del apellido
			for ( int i = 0; i < apellido.length; i++ ) {
				aux = file.readChar();
				apellido[i] = aux; // los voy guardando en el array
			}
			
			// convierto el array a String
			String apellidos = new String( apellido );
			dep = file.readInt();
			salario = file.readDouble();
			
			if( id > 0 ) {
				System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario );
			}
			
			// me posiciono para el siguiente empleado, cada empleado ocupa 36 bytes
			posicion = posicion + 36;
			
		}
		
		file.close();

	}

}
