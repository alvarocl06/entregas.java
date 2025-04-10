package bloque5.examen;

import java.util.*;
import java.util.stream.Collectors;

public class EstadisticasClientes {

    // Método estático: Agrupar compras por cliente - Versión funcional (con Streams)
    public static Map<Cliente, List<Compra>> agruparComprasPorClienteFuncional(List<Compra> compras) {
        return compras.stream()  // Convertir la lista de compras en un stream
            .collect(Collectors.groupingBy(Compra::getCliente));  // Agrupar por cliente usando el método getCliente
    }

    // Método estático: Agrupar compras por cliente - Versión imperativa (con un bucle for)
    public static Map<Cliente, List<Compra>> agruparComprasPorClienteImperativo(List<Compra> compras) {
        Map<Cliente, List<Compra>> mapaComprasPorCliente = new HashMap<>();  // Usamos un HashMap para almacenar el resultado
        
        // Recorremos la lista de compras y agrupamos por cliente
        for (Compra compra : compras) {
            Cliente cliente = compra.getCliente();  // Obtenemos el cliente de cada compra
            mapaComprasPorCliente.putIfAbsent(cliente, new ArrayList<>());  // Si el cliente no existe en el mapa, lo inicializamos
            mapaComprasPorCliente.get(cliente).add(compra);  // Añadimos la compra a la lista correspondiente al cliente
        }
        
        return mapaComprasPorCliente;  // Devolvemos el mapa con las compras agrupadas
    }

}
