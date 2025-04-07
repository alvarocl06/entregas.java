package entrega2;

import java.util.Comparator;

public class TestListaOrdenadaSinRepeticion {

    public static void main(String[] args) {
        // Crear el comparador para enteros
        Comparator<Integer> intComparator = Comparator.naturalOrder();

        // Crear la lista ordenada sin repetición para enteros
        ListaOrdenadaSinRepeticion<Integer> listaOrdenadaSinRepeticion = ListaOrdenadaSinRepeticion.of(intComparator);

        System.out.println("----- Prueba de ListaOrdenadaSinRepeticion -----");
        
        // Añadir elementos, incluyendo duplicados
        System.out.println("Añadiendo elementos: 5, 2, 8, 1, 3, 5, 2");
        listaOrdenadaSinRepeticion.add(5);
        listaOrdenadaSinRepeticion.add(2);
        listaOrdenadaSinRepeticion.add(8);
        listaOrdenadaSinRepeticion.add(1);
        listaOrdenadaSinRepeticion.add(3);
        listaOrdenadaSinRepeticion.add(5);  // Duplicado
        listaOrdenadaSinRepeticion.add(2);  // Duplicado

        // Mostrar los elementos después de agregar
        System.out.println("Elementos en la lista: " + listaOrdenadaSinRepeticion.getElementos());
        System.out.println("Tamaño de la lista: " + listaOrdenadaSinRepeticion.getElementos().size());

        // Verificación de que se esperan 5 elementos únicos ordenados
        System.out.println("Se esperan 5 elementos únicos ordenados");

        // Eliminar el primer elemento
        System.out.println("Eliminando el primer elemento: " + listaOrdenadaSinRepeticion.getElementos().get(0));
        listaOrdenadaSinRepeticion.getElementos().remove(0);

        // Mostrar los elementos después de eliminar
        System.out.println("Elementos después de eliminar: " + listaOrdenadaSinRepeticion.getElementos());

        // Añadir un lote de elementos, incluyendo un duplicado
        System.out.println("Añadiendo elementos en lote: 4, 6, 7, 4");
        listaOrdenadaSinRepeticion.add(4);
        listaOrdenadaSinRepeticion.add(6);
        listaOrdenadaSinRepeticion.add(7);
        listaOrdenadaSinRepeticion.add(4);  // Duplicado

        // Mostrar los elementos después de añadir el lote
        System.out.println("Elementos después de añadir lote: " + listaOrdenadaSinRepeticion.getElementos());
    }

}
