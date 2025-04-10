package bloque5.examen;
import entrega2.Cola;
import java.util.List;
import java.util.stream.Collectors;

public class ColaComprasPendientes extends Cola<Compra> {

    // Constructor
    public ColaComprasPendientes() {
        super();
    }

    // Método 1: buscarCompraPorDescripcion(String desc) - Implementación Imperativa
    public Compra buscarCompraPorDescripcion(String desc) {
        // Recorremos la cola y buscamos la primera compra cuya descripción contenga el texto indicado
        for (Compra compra : this.getElementos()) {
            if (compra.getDescripcion().contains(desc)) {
                return compra;  // Devolvemos la primera compra que coincida con la descripción
            }
        }
        return null;  // Si no se encuentra ninguna, devolvemos null
    }

    // Método 2: filtrarPorClienteYProducto(Cliente cliente, String producto) - Implementación Funcional con .stream()
    public List<Compra> filtrarPorClienteYProducto(Cliente cliente, String producto) {
        return this.getElementos().stream()  // Crear un flujo de elementos de la cola
            .filter(compra -> compra.getCliente().equals(cliente))  // Filtramos por cliente
            .filter(compra -> compra.getDescripcion().contains(producto))  // Filtramos por producto en la descripción
            .collect(Collectors.toList());  // Recogemos los resultados en una lista
    }
}
