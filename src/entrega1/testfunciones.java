package entrega1;


public class testfunciones {

	 public static void main(String[] args) {
		 
		 	System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 1:");
		 	int n = 2;
		 	int k = 4;
		 	System.out.println("El producto de" + n + "y" + k + "es" + funciones.productoConsecutivos(n, k));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 2:");
			System.out.println(funciones.productoSecuenciaGeometrica(2,2,4));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 3:");
			System.out.println(funciones.Combinatorio(4,3));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 4:");
		    System.out.println(funciones.S(5,2));
		    System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 5:");
		    System.out.println(funciones.metodoNewton(4,3));
	 }
}
