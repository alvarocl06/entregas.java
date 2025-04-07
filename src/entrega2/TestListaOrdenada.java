package entrega2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class TestListaOrdenada {

    public static void main(String[] args) {
        // Crear el comparador para enteros
        Comparator<Integer> intComparator = Comparator.naturalOrder();

        // Crear la lista ordenada para enteros
        ListaOrdenada<Integer> listaOrdenada = ListaOrdenada.of(intComparator);

        System.out.println("----- Prueba de ListaOrdenada -----");
        
        // Añadir elementos
        System.out.println("Añadiendo elementos: 5, 2, 8, 1, 3");
        listaOrdenada.add(5);
        listaOrdenada.add(2);
        listaOrdenada.add(8);
        listaOrdenada.add(1);
        listaOrdenada.add(3);

        // Mostrar los elementos después de agregar
        System.out.println("Elementos en la lista: " + listaOrdenada.getElementos());
        System.out.println("Tamaño de la lista: " + listaOrdenada.getElementos().size());

        // Eliminar el primer elemento
        System.out.println("Eliminando el primer elemento: " + listaOrdenada.getElementos().get(0));
        listaOrdenada.getElementos().remove(0);

        // Mostrar los elementos después de eliminar
        System.out.println("Elementos después de eliminar: " + listaOrdenada.getElementos());

        // Añadir un lote de elementos
        System.out.println("Añadiendo elementos en lote: 4, 6, 7");
        listaOrdenada.add(4);
        listaOrdenada.add(6);
        listaOrdenada.add(7);

        // Mostrar los elementos después de añadir el lote
        System.out.println("Elementos después de añadir lote: " + listaOrdenada.getElementos());

        // Eliminar todos los elementos
        System.out.println("Eliminando todos los elementos: " + listaOrdenada.getElementos());
        listaOrdenada.getElementos().clear();

        // Verificar si la lista está vacía
        System.out.println("¿Está vacía? " + listaOrdenada.getElementos().isEmpty());
        
        // Prueba con strings
        System.out.println("\nPrueba con strings:");

        // Crear el comparador para cadenas
        Comparator<String> stringComparator = Comparator.naturalOrder();
        
        // Crear la lista ordenada para cadenas
        ListaOrdenada<String> listaString = ListaOrdenada.of(stringComparator);

        // Añadir elementos
        listaString.add("apple");
        listaString.add("banana");
        listaString.add("cherry");
        listaString.add("date");

        // Mostrar los elementos ordenados
        System.out.println("Elementos ordenados: " + listaString.getElementos());
    }

}