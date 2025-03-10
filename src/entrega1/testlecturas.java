package entrega1;

public class testlecturas {

	 public static void main(String[] args) {
		 
		 	System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 6:");
		 	System.out.println("El número de veces que aparece la palabra quijote en el fichero resources/lin_quijote.txt es:" + lecturas.contadorPalabras("File2", " ", "quijote"));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 7:");
			System.out.println("Las líneas en las que aparece la palabra quijote son:" + lecturas.creadorLista("File2", "quijote"));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 8:");
			System.out.println("Las palabras únicas en el fichero resources/archivo_palabras.txt son:" + lecturas.obtenerPalabrasUnicas("File2"));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 9:");
		    System.out.println("La longitud promedio de las líneas del fichero resources/palabras_random.csv es:" + lecturas.longitudPromedioLineas("File2", " "));
	 }
}


