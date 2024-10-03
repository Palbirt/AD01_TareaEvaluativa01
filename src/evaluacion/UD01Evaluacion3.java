package evaluacion;

import java.io.*;

public class UD01Evaluacion3 {

	public static void main(String[] args) throws IOException {

		
        File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\ejercicio3.pdf"); // declara fichero
		DataInputStream dataIS = new DataInputStream(new FileInputStream(fichero));
		
		byte[] cabecera = new byte[4];
		dataIS.read(cabecera); // Leer los primeros 4 bytes
		
		// Verificar la cabecera
        if (cabecera[0] == 37 && cabecera[1] == 80 && cabecera[2] == 68 && cabecera[3] == 70) {
            System.out.println("El archivo es un PDF válido.");
        } else {
            System.out.println("El archivo no es un PDF válido.");
        }
		
		dataIS.close();

	}

}
