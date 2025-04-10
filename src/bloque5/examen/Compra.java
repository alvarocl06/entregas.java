package bloque5.examen;

import java.util.*;

public final class Compra {
    // Propiedades inmutables
    private final Cliente cliente;
    private final String descripcion;
    private final double importe;

    // Constructor canónico
    public Compra(Cliente cliente, String descripcion, double importe) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede ser nula o vacía.");
        }
        if (importe < 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo.");
        }
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    // Método de factoría
    public static Compra of(Cliente cliente, String descripcion, double importe) {
        return new Compra(cliente, descripcion, importe);
    }

    // Métodos de consulta
    public Cliente getCliente() {
        return cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    // Sobrescritura de toString para que tenga el formato requerido
    @Override
    public String toString() {
        return "Compra [Nombre de cliente= " + cliente.getNombre() +
               ", descripción= " + descripcion + 
               ", importe= " + String.format("%.2f", importe) + " €]";
    }

    // Sobrescritura de equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compra compra = (Compra) o;
        return cliente.equals(compra.cliente) &&
               descripcion.equals(compra.descripcion) &&
               Double.compare(compra.importe, importe) == 0;
    }

    // Sobrescritura de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(cliente, descripcion, importe);
    }

}
