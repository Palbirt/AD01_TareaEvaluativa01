package objetosBinarios;

import java.io.*;

public class EscribirFichObject {

	public static void main(String[] args) throws IOException {

		Persona persona;
		
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\objetosBinarios\\fichPersona.dat");
		FileOutputStream fileout = new FileOutputStream(fichero, true); 
		
		//conecta el flujo de bytes al flujo de datos
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		String[] nombres = { "Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andrés", "Julio", "Antonio", "María Jesús" };
		
		int[] edades = { 15, 14, 13, 15, 16, 12, 16, 14, 13 };
		
		System.out.println("GRABO LOS DATOS DE LA PERSONA");
		
		for ( int i = 0; i < edades.length; i++ ) {
			persona = new Persona( nombres[i], edades[i] );
			dataOS.writeObject(persona);
			
		}
		
		dataOS.close();

	}

}
