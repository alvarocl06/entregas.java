package entrega2;
import java.util.*;
public class TestColaPrioridad {

    public static void main(String[] args) {
        // Crear una instancia de ColaPrioridad con tipo String para el valor y Integer para la prioridad
        ColaPrioridad<String, Integer> cola = ColaPrioridad.ofPriority();

        // Prueba de añadir elementos con prioridad
        System.out.println("----- Prueba de ColaPrioridad -----");

        // Añadir elementos con prioridad
        System.out.println("Añadiendo elementos con prioridad:");
        cola.add("Crítico", 1);
        cola.add("Normal", 3);
        cola.add("Urgente", 2);
        cola.add("Bajo", 4);

        // Mostrar los elementos por prioridad
        System.out.println("Elementos en la cola por prioridad: " + cola.valuesAsList());

        // Mostrar los elementos con sus prioridades
        System.out.println("Elementos con sus prioridades: " + cola.getElementos());

        // Mostrar el tamaño de la cola
        System.out.println("Tamaño de la cola: " + cola.getElementos().size());

        // Cambiar la prioridad de 'Normal' de 3 a 1
        System.out.println("\nCambiando la prioridad de 'Normal' de 3 a 1:");
        cola.decreasePriority("Normal", 1);
        System.out.println("Elementos con prioridad actualizada: " + cola.valuesAsList());

        // Desencolar elementos por prioridad
        System.out.println("\nDesencolando elementos por prioridad:");

        // Desencolar el primer elemento
        System.out.println("Desencolado: " + cola.removeValue());
        System.out.println("Cola restante: " + cola.valuesAsList());

        // Desencolar el segundo elemento
        System.out.println("Desencolado: " + cola.removeValue());
        System.out.println("Cola restante: " + cola.valuesAsList());

        // Desencolar el tercer elemento
        System.out.println("Desencolado: " + cola.removeValue());
        System.out.println("Cola restante: " + cola.valuesAsList());

        // Desencolar el cuarto elemento
        System.out.println("Desencolado: " + cola.removeValue());
        System.out.println("Cola restante: " + cola.valuesAsList());

        // Verificar si la cola está vacía
        System.out.println("\n¿Está vacía? " + cola.getElementos().isEmpty());

        // Intentar desencolar de una cola vacía y manejar la excepción
        try {
            System.out.println("\nIntentando desencolar de una cola vacía:");
            cola.removeValue();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar desencolar de una cola vacía: " + e.getMessage());
        }

        // Prueba con addAll
        System.out.println("\nPrueba con addAll:");
        // Añadir múltiples elementos con la misma prioridad
        cola.addAllValues(List.of("Tarea A", "Tarea B", "Tarea C"), 2);
        System.out.println("Elementos añadidos en lote con prioridad 2: " + cola.valuesAsList());

        // Añadir un elemento con una prioridad diferente
        cola.add("Tarea Urgente", 1);
        System.out.println("Después de añadir 'Tarea Urgente' con prioridad 1: " + cola.valuesAsList());
    }
}


