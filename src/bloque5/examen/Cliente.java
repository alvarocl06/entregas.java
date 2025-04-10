package bloque5.examen;

public final class Cliente {
	    // Propiedades inmutables
	    private final String nombre;
	    private final int antigüedad;

	    // Constructor canónico
	    public Cliente(String nombre, int antigüedad) {
	        if (nombre == null || nombre.trim().isEmpty()) {
	            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
	        }
	        if (antigüedad < 0) {
	            throw new IllegalArgumentException("La antigüedad no puede ser negativa.");
	        }
	        this.nombre = nombre;
	        this.antigüedad = antigüedad;
	    }

	    // Método de factoría
	    public static Cliente of(String nombre, int antigüedad) {
	        return new Cliente(nombre, antigüedad);
	    }

	    // Métodos de consulta
	    public String getNombre() {
	        return nombre;
	    }

	    public int getAntigüedad() {
	        return antigüedad;
	    }

	    // Sobrescritura de equals para que dos clientes sean iguales si tienen el mismo nombre
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Cliente cliente = (Cliente) o;
	        return nombre.equals(cliente.nombre);
	    }

	    // Sobrescritura de hashCode
	    @Override
	    public int hashCode() {
	        return nombre.hashCode();
	    }

	    // Sobrescritura de toString para que tenga el formato Cliente[nombre=Juan, antigüedad=5]
	    @Override
	    public String toString() {
	        return "Cliente[nombre=" + nombre + ", antigüedad=" + antigüedad + "]";
	    }

}
