package examen;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class examen {

public static int productoImpares(int n) {
	if (n <= 0) {
        throw new IllegalArgumentException("El valor de n debe ser mayor que 0.");
    }
	int producto = 1;
	int impar = 1;
	for (int i = 1; i <= n; i++) {
        producto *= impar; 
        impar += 2; 
    }
    
    return producto;
}
public static int sumaGeometricaAlternada(int a1, int r, int k ) {
	if (k <= 0) {
        throw new IllegalArgumentException("k debe ser mayor que 0"); 
	}
    if (a1 <= 0) {
        throw new IllegalArgumentException("a1 debe ser mayor que 0");
    }
    if (r <= 0) {
        throw new IllegalArgumentException("r debe ser mayor que 0");
    }
    int suma = 0; 
    for (int n = 1; n <= k; n++) {
        int termino = (int) (Math.pow(-1, n) * a1 * Math.pow(r, n - 1));
        suma += termino; // Sumamos el término a la suma total
    }
    
    return suma;   	
}
public static int combinatorioSinMultiplosDeTres(int n1, int k1 ) {
	if (k1 <= 0) {
        throw new IllegalArgumentException("k debe ser mayor que 0"); 
	}
	if (n1 <= 0) {
        throw new IllegalArgumentException("n debe ser mayor que 0"); 
	}
	if (n1 <= k1) {
        throw new IllegalArgumentException("n debe ser mayor que k"); 
	}
	int resultado = 1;

    for (int i = 0; i < k1; i++) {
        int num = n1 - i;
        if (num % 3 != 0) {
            resultado *= num;
        }
    }

    for (int i = 1; i <= k1; i++) {
        int den = i;
        if (den % 3 != 0) {
            resultado /= den;
        }
    }

    return resultado;
}
	public static List<String> filtrarLineasConsecutivas(String nombreArchivo, List<String> palabrasClave) {
		List<String> lineasFiltradas = new ArrayList<>();
    
		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
        
			while ((linea = br.readLine()) != null) {
				if (contienePalabrasConsecutivas(linea, palabrasClave)) {
					lineasFiltradas.add(linea);
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
    
		return lineasFiltradas;
	}

	public static boolean contienePalabrasConsecutivas(String linea, List<String> palabrasClave) {
		String[] palabras = linea.split("\\s+");
    
		for (int i = 0; i < palabras.length - 1; i++) {
			String palabra1 = palabras[i].toLowerCase(); 
			String palabra2 = palabras[i + 1].toLowerCase();
        
			if (palabrasClave.contains(palabra1) && palabrasClave.contains(palabra2)) {
				return true;
			}
		}
    
		return false; 
}
	public static void main(String[] args) {

		System.out.println("El producto de los numeros impares es: " + productoImpares(3));
		System.out.println("El producto de los numeros impares es: " + productoImpares(4));
		System.out.println("El resultado de la suma geométrica es: " + sumaGeometricaAlternada(3,4,2));
		System.out.println("El número combinatorio sin múltiplos de 3 es: " + combinatorioSinMultiplosDeTres(5,4));
		
        String nombreArchivo = "resources/fichero.txt";
        List<String> palabrasClave = Arrays.asList("palabra1", "palabra2", "palabra3");
        
        List<String> lineas = filtrarLineasConsecutivas(nombreArchivo, palabrasClave);
        
        if (!lineas.isEmpty()) {
            System.out.println("Líneas que contienen al menos dos palabras consecutivas de la lista:");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } else {
            System.out.println("No se encontraron líneas con palabras consecutivas de la lista.");
        }
}
}

