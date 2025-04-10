package bloque5.examen;
import entrega2.Pila;
import java.util.List;
import java.util.stream.Collectors;

public class HistorialCompras extends Pila<Compra> {

    // Constructor
    public HistorialCompras() {
        super();
    }

    // Método 1: totalGastadoPor(Cliente cliente)
    // Calcula el total gastado por un cliente específico usando Streams
    public double totalGastadoPor(Cliente cliente) {
        return this.getElementos().stream()
            .filter(compra -> compra.getCliente().equals(cliente))  // Filtrar compras del cliente
            .mapToDouble(Compra::getImporte)  // Mapear a los importes de las compras
            .sum();  // Sumar todos los importes
    }

    // Método 2: comprasMayoresA(double cantidad)
    // Devuelve la lista de compras cuyo importe es mayor que la cantidad indicada usando Streams
    public List<Compra> comprasMayoresA(double cantidad) {
        return this.getElementos().stream()
            .filter(compra -> compra.getImporte() > cantidad)  // Filtrar compras con importe mayor que la cantidad
            .collect(Collectors.toList());  // Recoger el resultado en una lista
    }

}
