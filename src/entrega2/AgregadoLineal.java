package entrega2;

	import java.util.ArrayList;
	import java.util.List;

public abstract class AgregadoLineal<E> {
	    // Lista interna para almacenar los elementos
	    protected List<E> elementos;

	    // Constructor que inicializa la lista interna
	    public AgregadoLineal() {
	        this.elementos = new ArrayList<>();
	    }

	    // Devuelve el tamaño de la estructura
	    public int size() {
	        return elementos.size();
	    }

	    // Verifica si la estructura está vacía
	    public boolean isEmpty() {
	        return elementos.isEmpty();
	    }

	    // Devuelve una lista con los elementos actuales
	    public List<E> elements() {
	        return new ArrayList<>(elementos);
	    }

	    // Método abstracto para agregar un elemento, debe ser implementado por las subclases
	    public abstract void add(E e);

	    // Agrega todos los elementos de una lista
	    public void addAll(List<E> list) {
	        if (list != null) {
	            elementos.addAll(list);
	        }
	    }

	    // Elimina y devuelve el último elemento (comportamiento de una estructura lineal común como pila)
	    public E remove() {
	        if (!isEmpty()) {
	            return elementos.remove(elementos.size() - 1);
	        }
	        return null;
	    }

	    // Elimina todos los elementos y los devuelve
	    public List<E> removeAll() {
	        List<E> removedElements = new ArrayList<>(elementos);
	        elementos.clear();
	        return removedElements;
	    }
	}

