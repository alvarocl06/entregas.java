package entrega2;
import java.util.*;


public class ColaPrioridad<E, P extends Comparable<P>> extends Cola<PriorityElement<E, P>> {

	    // Constructor
	    public ColaPrioridad() {
	        super();
	    }

	    // Método estático para crear una instancia de ColaPrioridad
	    public static <E, P extends Comparable<P>> ColaPrioridad<E, P> ofPriority() {
	        return new ColaPrioridad<>();
	    }

	    @Override
	    public void add(PriorityElement<E, P> element) {
	        // Agregar el elemento a la cola
	        elementos.add(element);
	        // Reordenar la cola por prioridad (menor prioridad primero)
	        ordenarPorPrioridad();
	    }

	    // Método para agregar un valor con una prioridad específica
	    public void add(E value, P priority) {
	        add(new PriorityElement<>(value, priority));
	    }

	    // Obtener los valores de la cola como una lista
	    public List<E> valuesAsList() {
	        List<E> values = new ArrayList<>();
	        for (PriorityElement<E, P> element : elementos) {
	            values.add(element.value());
	        }
	        return values;
	    }

	    // Cambiar la prioridad de un elemento
	    public void decreasePriority(E value, P newPriority) {
	        for (PriorityElement<E, P> element : elementos) {
	            if (element.value().equals(value)) {
	                // Crear un nuevo PriorityElement con la nueva prioridad
	                elementos.remove(element);
	                add(new PriorityElement<>(value, newPriority));
	                return;
	            }
	        }
	    }

	    // Eliminar el valor con la mayor prioridad (el de menor valor numérico)
	    public E removeValue() {
	        if (isEmpty()) {
	            return null;  // Si la cola está vacía, retornar null
	        }
	        // Eliminar y retornar el valor con la mayor prioridad (menor valor)
	        PriorityElement<E, P> element = elementos.remove(0);
	        return element.value();
	    }

	    // Agregar múltiples valores con la misma prioridad
	    public void addAllValues(List<E> values, P priority) {
	        for (E value : values) {
	            add(value, priority);
	        }
	    }

	    // Método para ordenar la cola por prioridad
	    private void ordenarPorPrioridad() {
	        elementos.sort(Comparator.comparing(PriorityElement<E, P>::priority));
	    }
	    public List<PriorityElement<E, P>> getElementos() {
	        return elementos;
	    }

}
