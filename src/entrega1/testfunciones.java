package entrega1;


public class testfunciones {

	 public static void main(String[] args) {
		 
		 	System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 1:");
		 	int n = 4;
		 	int k1 = 2;
		 	System.out.println("El producto de " +  n  + " y " +  k1  + " es: " + funciones.productoConsecutivos(n, k1)); 
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 2:");
		 	int a1 = 3;
		 	int r = 5;
		 	int k = 2;
			System.out.println("El producto de la secuencia geométrica con a1 = " + a1 + ", r = " + r + " y k = " + k +  " es: " + funciones.productoSecuenciaGeometrica(a1,r,k));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 3:");
		 	int n1 = 4;
		 	int k2 = 2;
			System.out.println("El número combinatorio de " + n1 + " y " + k2 +  " es: " + funciones.Combinatorio(n1,k2));
			System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 4:");
		 	int n2 = 4;
		 	int k3 = 2;
		    System.out.println("El número S(n,k) siendo n = " + n2 + " y k = "  + k3 + " es: " + funciones.S(n2,k3));
		    System.out.println("##########################################");
		 	System.out.println("TEST DE LA FUNCIÓN 5:");
		 	double a = 3;
		 	double epsilon = 0.001; 
		    System.out.println("Resultado de la función 5 con a = " + a + " y e = " + epsilon + ", f(x) = 2x^2  y f'(x) = 4x: " + funciones.metodoNewton(a,epsilon));
	 }
}
