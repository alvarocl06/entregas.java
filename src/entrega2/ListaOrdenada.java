package entrega2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaOrdenada<E> extends AgregadoLineal<E> {

	    protected Comparator<E> comparator;

	    // Constructor que recibe el comparador para ordenar los elementos
	    public ListaOrdenada(Comparator<E> comparator) {
	        super();
	        this.comparator = comparator;
	    }

	    // Método estático para crear una instancia de ListaOrdenada
	    public static <E> ListaOrdenada<E> of(Comparator<E> comparator) {
	        return new ListaOrdenada<>(comparator);
	    }

	    // Encuentra la posición donde el elemento debe ser insertado, respetando el orden
	    private int indexOrder(E e) {
	        int left = 0;
	        int right = elementos.size() - 1;

	        // Búsqueda binaria para encontrar la posición adecuada
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int compareResult = comparator.compare(e, elementos.get(mid));

	            if (compareResult == 0) {
	                return mid;  // Si el elemento es igual, se coloca en esa posición
	            } else if (compareResult < 0) {
	                right = mid - 1;  // El elemento debe ir antes
	            } else {
	                left = mid + 1;  // El elemento debe ir después
	            }
	        }

	        return left;  // Devuelve la posición donde se debe insertar
	    }

	    @Override
	    public void add(E e) {
	        // Encontramos la posición en la que se debe insertar el nuevo elemento
	        int position = indexOrder(e);
	        
	        // Insertamos el elemento en la posición correcta
	        elementos.add(position, e);
	    }
	    public List<E> getElementos() {
	        return elementos;
	    }
}
