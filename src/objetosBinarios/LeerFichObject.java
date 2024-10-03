package objetosBinarios;

import java.io.*;

public class LeerFichObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Persona persona;
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\objetosBinarios\\fichPersona.dat");
		
		ObjectInputStream dataIS = new ObjectInputStream( new FileInputStream(fichero)); 
		
		int i = 1; 
		
		try {
			
			while (true) {
				persona = (Persona) dataIS.readObject();
				System.out.print( i + " => ");
				i++;
				System.out.printf("Nombre: %S, edad: %d %n", persona.getNombre(), persona.getEdad() );
			}
			
		} catch (EOFException eo) {
			System.out.println("FIN DE LECTURA");
		} catch (StreamCorruptedException x) {
			
		}
		
		dataIS.close();

	}

}
