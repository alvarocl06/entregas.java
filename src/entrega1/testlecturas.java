package entrega1;

public class testlecturas {

	 public static void main(String[] args) {
		 
		 	System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 6:");
		 	String fichero = "resources/lin_quijote.txt";
		 	String sep = " ";
		 	String palabra = "quijote";
		 	System.out.println("El número de veces que aparece la palabra quijote en el fichero resources/lin_quijote.txt es:" + lecturas.contadorPalabras(fichero,sep,palabra));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 7:");
			System.out.println("Las líneas en las que aparece la palabra quijote son:" + lecturas.creadorLista(fichero,palabra));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 8:");
		 	String fichero1 = "resources/archivo_palabras.txt";
			System.out.println("Las palabras únicas en el fichero resources/archivo_palabras.txt son:" + lecturas.obtenerPalabrasUnicas(fichero1));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 9:");
		 	String fichero2 = "resources/palabras_random.csv";
		    System.out.println("La longitud promedio de las líneas del fichero resources/palabras_random.csv es:" + lecturas.longitudPromedioLineas(fichero2,sep));
	 }
}


