package bloque5.examen;

import java.util.List;
import java.util.Map;


public class Test {

    public static void main(String[] args) {

        // Crear clientes
        Cliente ana = Cliente.of("Ana", 5);
        Cliente juan = Cliente.of("Juan", 2);
        Cliente luis = Cliente.of("Luis", 7);

        // Crear compras
        Compra c1 = Compra.of(ana, "Agenda personalizada", 25.5);
        Compra c2 = Compra.of(juan, "Camiseta estampada", 60.0);
        Compra c3 = Compra.of(ana, "Taza con foto", 15.0);
        Compra c4 = Compra.of(luis, "Poster gigante", 80.0);

        // ================================
        // PRUEBA ClientesPorAntiguedad
        // ================================
        ClientesPorAntiguedad lista = new ClientesPorAntiguedad();
        lista.add(ana);
        lista.add(juan);
        lista.add(luis);

        System.out.println("Top 2 clientes más antiguos:");
        for (Cliente c : lista.topClientes(2)) {
            System.out.println(c);
        }

        // ================================
        // PRUEBA HistorialCompras
        // ================================
        HistorialCompras historial = new HistorialCompras();
        historial.add(c1);
        historial.add(c2);
        historial.add(c3);
        historial.add(c4);

        System.out.println("\nTotal gastado por Ana: " + historial.totalGastadoPor(ana));
        System.out.println("Compras mayores a 50:");
        for (Compra compra : historial.comprasMayoresA(50)) {
            System.out.println(compra);
        }

        // ================================
        // PRUEBA ColaComprasPendientes
        // ================================
        ColaComprasPendientes cola = new ColaComprasPendientes();
        cola.add(c1);
        cola.add(c2);
        cola.add(c3);
        cola.add(c4);

        System.out.println("\nBuscar compra que contenga 'foto':");
        Compra encontrada = cola.buscarCompraPorDescripcion("foto");
        System.out.println(encontrada != null ? encontrada : "No encontrada");

        System.out.println("\nFiltrar compras de Ana que contengan 'Taza':");
        for (Compra compra : cola.filtrarPorClienteYProducto(ana, "Taza")) {
            System.out.println(compra);
        }

        // ================================
        // PRUEBA EstadisticasClientes
        // ================================
        List<Compra> todasLasCompras = List.of(c1, c2, c3, c4);
        Map<Cliente, List<Compra>> agrupadas = EstadisticasClientes.agruparComprasPorClienteFuncional(todasLasCompras);

        System.out.println("\nAgrupación de compras por cliente:");
        for (Cliente cliente : agrupadas.keySet()) {
            System.out.println("Cliente: " + cliente);
            for (Compra compra : agrupadas.get(cliente)) {
                System.out.println(" - " + compra);
            }
        }
    }
}
