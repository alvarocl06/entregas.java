package entrega2;


import java.util.Comparator;

public class ListaOrdenadaSinRepeticion<E> extends ListaOrdenada<E> {

	    // Constructor que recibe el comparador para ordenar los elementos
	    public ListaOrdenadaSinRepeticion(Comparator<E> comparator) {
	        super(comparator);
	    }

	    // Método estático para crear una instancia de ListaOrdenadaSinRepeticion
	    public static <E> ListaOrdenadaSinRepeticion<E> of(Comparator<E> comparator) {
	        return new ListaOrdenadaSinRepeticion<>(comparator);
	    }

	    @Override
	    public void add(E e) {
	        // Verificar si el elemento ya existe en la lista
	        for (E element : elementos) {
	            if (comparator.compare(element, e) == 0) {
	                // Si el elemento ya está en la lista, no lo agregamos
	                return;
	            }
	        }
	        
	        // Si no se encuentra el elemento duplicado, se agrega a la lista
	        super.add(e);
	    }
}
