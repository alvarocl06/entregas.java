package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Pila<E> extends AgregadoLineal<E> {
    
    // Constructor
    public Pila() {
        // Inicializamos el ArrayList de elementos
        super();
    }

    @Override
    public void add(E e) {
        // Agregar un elemento al principio (simula una pila LIFO)
        elementos.add(0, e);
    }

    // Método para obtener el elemento superior sin eliminarlo
    public E top() {
        if (isEmpty()) {
            return null;  // Si la pila está vacía, devolver null
        }
        return elementos.get(0);  // Devolver el primer elemento (el de más reciente inserción)
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;  // Si la pila está vacía, devolver null
        }
        return elementos.remove(0);  // Eliminar el primer elemento (el de más reciente inserción)
    }
    public List<E> getElementos() {
        return elementos;
    }

}
