package evaluacion;

import java.io.*;

public class UD01Evaluacion4A {
	
	public static void main(String[] args) throws IOException {
		
		File fichero = new File("D:\\MULTIPLATAFORMA\\ACCESO A DATOS\\work-space\\UD2\\src\\evaluacion\\Marvel.dat");
		
		//declara el fichero de acceso aleatorio
		RandomAccessFile file = new RandomAccessFile(fichero, "rw");
		
		// arrays con los datos
		int [] ids= {1, 2, 3, 4, 5, 6, 7};
		String[] dnis= {"01010101A", "03030303C", "05050505E", "07070707G", "02020202B", "04040404D", "06060606F"};
		String[] noms= {"Spiderman", "Green Goblin", "Storm", "Wolverine", "Mystique", "IronMan", "Mandarin"};
		String[] identidades = {"Peter Parker", "Norman Osborn", "Ororo Munroe","James Howlett", "Raven Darkholme", "Tony Stark", "Zhang Tong"};
		String[] tipos = {"heroe","villano","heroe","heroe","villano","heroe","villano"};
		int[] pesos = {76,84,66,136,78,102,70};
		int[] alturas = {178,183,156,152,177,182,188};
		
		StringBuffer buffer = null; // buffer para almacenar el apellido
		
		try {
		
			for ( int i = 0; i < ids.length; i++ ) { //recorro los arrays
				
				file.writeInt( ids[i] ); 
				
				buffer = new StringBuffer( dnis[i] );
				buffer.setLength(9); // 9 caracteres para el dni
				file.writeChars( buffer.toString() ); // insertar dni
				
				buffer = new StringBuffer( noms[i] );
				buffer.setLength(10); // 10 caracteres para el nombre
				file.writeChars( buffer.toString() ); // insertar nombre
				
				buffer = new StringBuffer( identidades[i] );
				buffer.setLength(20); // 20 caracteres para la identidad secreta
				file.writeChars( buffer.toString() ); // insertar identidad secreta
				
				buffer = new StringBuffer( tipos[i] );
				buffer.setLength(10); // 10 caracteres para el tipo
				file.writeChars( buffer.toString() ); // insertar tipo
				
				
				file.writeInt( pesos[i] ); 
				file.writeInt( alturas[i] ); 
			}
			
			System.out.println("La carga de los personajes ha terminado correctamente");
			
		} catch ( IOException io ) {
			System.err.println( "Se ha producido un error al cargar el archivo: " + io.getMessage() );
		}
			
		file.close();
	}

}
