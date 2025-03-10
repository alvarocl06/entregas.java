package entrega1;

import java.util.ArrayList;

import us.lsi.tools.File2;

import java.util.*;
public class lecturas {
	
	//ejercicio 6
	public static int contadorPalabras(String fichero, String sep, String palabra) {
		int a= 0;
		
		List<String> lista = File2.lineasDeFichero(fichero);
		if (lista == null || lista.isEmpty()) {
			return 0;
		}
		if (sep == null || sep.isEmpty()) {
			return 0;
		}
		
		String cadenamod = palabra.toLowerCase();
		
		for (String cadena:lista) {
			String[] palabras = cadena.split(sep);
			for (String palabra1 : palabras) {
				String palabra2 = palabra1.toLowerCase();
				if (palabra2.contains(cadenamod)) {
					a++;
				}
			}
			
		}
		return a;
	}
	
	//ejercicio 7
	public static List<String> creadorLista(String fichero, String palabra){
		List<String> lista = File2.lineasDeFichero(fichero);
		List<String> lista2 = new ArrayList<String>();
		
		if (lista == null || lista.isEmpty() || palabra == null || palabra.isEmpty()) {
			return null;
		}
		String cadenamod = palabra.toLowerCase();
		for (String linea: lista) {
			String[] palabras = linea.split("  ");
			for (String palabra1 : palabras) {
				if (palabra1.toLowerCase().contains(cadenamod)) {
					lista2.add(linea.trim());
				}
			}
		}
		return lista2;
	}
		
	//ejercicio 8
	public static List<String> obtenerPalabrasUnicas(String fichero1){
		List<String> lista = File2.lineasDeFichero(fichero1);
		List<String> lista2 = new ArrayList<String>();
		
		if (lista == null || lista.isEmpty()) {
			return null;
		}
		for (String linea: lista) {
			String[] palabras = linea.split(" ");
			for (String palabra1 : palabras) {
				if (lista2.contains(palabra1)) {
					lista2.add(palabra1);
				}
			}
		}
		return lista2;			
		
	}
	
	//ejercicio 9
	public static Double longitudPromedioLineas(String fichero2, String sep) {
		double a = 0.;
		double b = 0.;
		List<String> lista = File2.lineasDeFichero(fichero2);
		if (lista == null || lista.isEmpty() || sep == null || sep.isEmpty()) {
			return 0.;
		}
		
		for (String linea: lista) {
			a++;
			String[] palabras = linea.split(sep);
			b += palabras.length;
		}
		if (a == 0. || b == 0.) {
			return 0.;
		}
		return b/a;
			
	}
	
}
