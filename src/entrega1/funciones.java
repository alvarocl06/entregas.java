package entrega1;

public class funciones {
	// ejercicio 1
	public static int productoConsecutivos(int n, int k1) {
        int resultado = 1;
        
        for (int i = 0; i < k1; i++) {
            resultado *= (n - i);  
        }
        
        return resultado;
    }
	//ejercicio 2
	public static int productoSecuenciaGeometrica(int a1, int r, int k) {
        int producto = 1;
        
        for (int n = 1; n <= k; n++) {
            int an = a1 * (int) Math.pow(r, n - 1);  
            producto *= an;  
        }
        
        return producto;
    }
	//ejercicio 3
	public static int factorial(int x) {
        int resultado = 1;
        for (int i = 1; i <= x; i++) {
            resultado *= i;
        }
        return resultado;
    }
	
	public static int Combinatorio(int n1, int k2) {
		if (k2 > n1 ) {
			return 0;	
		}
		return factorial(n1) / (factorial(k2) * factorial(n1 - k2));
	}
	//ejercicio 4
	 public static int coeficienteBinomial(int n2, int k3) {
	        if (k3 > n2 || k3 < 0) {
	            return 0;
	        }
	        return factorial(n2) / (factorial(k3) * factorial(n2 - k3));
	    }

	    public static double S(int n2, int k3) {
	        double suma = 0;
	        
	        for (int i = 0; i <= k3; i++) {
	            suma += Math.pow(-1, i) * coeficienteBinomial(k3 + 1, i + 1) * Math.pow(k3 - i, n2);
	        }
	        
	        return suma / factorial(k3);
	    }
	    //ejercicio 5
	    public static double f(double x) {
	        return x * x - 2;
	    }

	    public static double fPrima(double x) {
	        return 2 * x;
	    }

	    public static double metodoNewton(double a, double epsilon) {
	        double x_n = a;  

	        while (Math.abs(f(x_n)) > epsilon) {
	            x_n = x_n - f(x_n) / fPrima(x_n);
	        }

	        return x_n;  
	    }
	    //ejemplos
	    public static void main(String[] args) {
			System.out.println(productoConsecutivos(4,2));
			System.out.println(productoSecuenciaGeometrica(2,2,4));
			System.out.println(Combinatorio(4,3));
		    System.out.println(S(5,2));
		    System.out.println(metodoNewton(4,3));
		}
	    
}
