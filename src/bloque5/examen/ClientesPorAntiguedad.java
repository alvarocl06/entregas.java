package bloque5.examen;
import entrega2.ListaOrdenada;
import java.util.Comparator;
import java.util.List;

public class ClientesPorAntiguedad extends ListaOrdenada<Cliente> {

    // Constructor que recibe un comparador que ordene los clientes por antigüedad descendente
    public ClientesPorAntiguedad() {
        super(Comparator.comparing(Cliente::getAntigüedad).reversed());
    }

    // Método que devuelve los 'n' clientes más antiguos
    public List<Cliente> topClientes(int n) {
        // Verificamos que n no sea mayor que el tamaño de la lista
        if (n > size()) {
            throw new IllegalArgumentException("El número de clientes solicitados es mayor al número de clientes disponibles.");
        }

        // Devolvemos los primeros 'n' clientes de la lista
        return getElementos().subList(0, n);
    }

}
