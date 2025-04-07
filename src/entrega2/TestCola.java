package entrega2;

public class TestCola {

    public static void main(String[] args) {
        // Crear una instancia de la cola
        Cola<String> cola = Cola.of();

        // Prueba de añadir elementos a la cola
        System.out.println("----- Prueba de Cola (FIFO) -----");

        // Añadir elementos
        System.out.println("Añadiendo elementos: 'primero', 'segundo', 'tercero'");
        cola.add("primero");
        cola.add("segundo");
        cola.add("tercero");

        // Mostrar los elementos en la cola
        System.out.println("Elementos en la cola: " + cola.getElementos());
        System.out.println("Tamaño de la cola: " + cola.getElementos().size());

        // Desencolar elementos
        System.out.println("\nDesencolando elementos:");

        // Desencolar el primer elemento
        System.out.println("Desencolado: " + cola.remove());
        System.out.println("Cola restante: " + cola.getElementos());

        // Desencolar el segundo elemento
        System.out.println("Desencolado: " + cola.remove());
        System.out.println("Cola restante: " + cola.getElementos());

        // Desencolar el tercer elemento
        System.out.println("Desencolado: " + cola.remove());
        System.out.println("Cola restante: " + cola.getElementos());

        // Verificar si la cola está vacía
        System.out.println("\n¿Está vacía? " + cola.getElementos().isEmpty());

        // Intentar desencolar de una cola vacía y manejar la excepción
        try {
            System.out.println("\nIntentando desencolar de una cola vacía:");
            cola.remove();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar desencolar de una cola vacía: " + e.getMessage());
        }
    }

}
