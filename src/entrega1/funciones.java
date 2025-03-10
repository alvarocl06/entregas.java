package entrega1;

public class funciones {
	// ejercicio 1
	public static int productoConsecutivos(int n, int k) {
        int resultado = 1;
        
        for (int i = 0; i < k; i++) {
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
	
	public static int Combinatorio(int n, int k) {
		if (k > n ) {
			return 0;	
		}
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	//ejercicio 4
	 public static int coeficienteBinomial(int n, int k) {
	        if (k > n || k < 0) {
	            return 0;
	        }
	        return factorial(n) / (factorial(k) * factorial(n - k));
	    }

	    public static double S(int n, int k) {
	        double suma = 0;
	        
	        for (int i = 0; i <= k; i++) {
	            suma += Math.pow(-1, i) * coeficienteBinomial(k + 1, i + 1) * Math.pow(k - i, n);
	        }
	        
	        return suma / factorial(k);
	    }
	    //ejercicio 5
	    public static float f(float x) {
	        return x * x - 2;
	    }

	    public static float fPrima(float x) {
	        return 2 * x;
	    }

	    public static float metodoNewton(float a, float epsilon) {
	        float x_n = a;  

	        while (Math.abs(f(x_n)) > epsilon) {
	            x_n = x_n - f(x_n) / fPrima(x_n);
	        }

	        return x_n;  
	    }
	    //ejemplos
	    public static void main(String[] args) {
			System.out.println(productoConsecutivos(6,5));
			System.out.println(productoSecuenciaGeometrica(2,2,4));
			System.out.println(Combinatorio(4,3));
		    System.out.println(S(5,2));
		    System.out.println(metodoNewton(4,3));
		}
	    
}
