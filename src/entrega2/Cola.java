package entrega2;


import java.util.ArrayList;
import java.util.List;

public class Cola<E> extends AgregadoLineal<E> {

	    // Constructor por defecto
	    public Cola() {
	        super();
	    }

	    // Método estático para crear una instancia de Cola
	    public static <E> Cola<E> of() {
	        return new Cola<>();
	    }

	    @Override
	    public void add(E e) {
	        // Agregar el elemento al final de la cola
	        elementos.add(e);
	    }

	    @Override
	    public E remove() {
	        // Verificar si la cola está vacía antes de intentar eliminar
	        if (isEmpty()) {
	            throw new IllegalStateException("No se puede eliminar de un agregado vacío.");
	        }
	        // Eliminar y devolver el primer elemento de la cola
	        return elementos.remove(0);
	    }

	    // Opcional: Implementación de removeAll() para eliminar todos los elementos
	    @Override
	    public List<E> removeAll() {
	        List<E> removedElements = new ArrayList<>(elementos);
	        elementos.clear();
	        return removedElements;
	    }
	    public List<E> getElementos() {
	        return elementos;
	    }
}
