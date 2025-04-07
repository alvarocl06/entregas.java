package entrega2;

public class TestPila {

    public static void main(String[] args) {
        // Crear una instancia de la pila de tipo Double
        Pila<Double> pila = new Pila<>();

        // Prueba de añadir elementos a la pila
        System.out.println("----- Prueba de Pila (LIFO) -----");

        // Añadir elementos
        System.out.println("Añadiendo elementos: 1.1, 2.2, 3.3");
        pila.add(1.1);
        pila.add(2.2);
        pila.add(3.3);

        // Mostrar los elementos en la pila
        System.out.println("Elementos en la pila: " + pila.getElementos());
        System.out.println("Tamaño de la pila: " + pila.getElementos().size());

        // Obtener el elemento en el tope
        System.out.println("\nElemento en el tope: " + pila.top());

        // Desapilar elementos
        System.out.println("\nDesapilando elementos:");

        // Desapilar el primer elemento
        System.out.println("Desapilado: " + pila.remove());
        System.out.println("Pila restante: " + pila.getElementos());

        // Desapilar el segundo elemento
        System.out.println("Desapilado: " + pila.remove());
        System.out.println("Pila restante: " + pila.getElementos());

        // Desapilar el tercer elemento
        System.out.println("Desapilado: " + pila.remove());
        System.out.println("Pila restante: " + pila.getElementos());

        // Verificar si la pila está vacía
        System.out.println("\n¿Está vacía? " + pila.getElementos().isEmpty());

        // Intentar acceder al tope de una pila vacía y manejar la excepción
        try {
            System.out.println("\nIntentando acceder al tope de una pila vacía:");
            pila.top();
        } catch (Exception e) {
            System.out.println("Excepción correctamente lanzada al intentar acceder al tope de una pila vacía: " + e.getMessage());
        }
    }
}


