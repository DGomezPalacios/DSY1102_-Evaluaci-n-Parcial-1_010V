package GomezPalaciosDaniela;

public class VehiculoCarga extends Vehiculo implements IntVehiculo {
    private int capacidadCarga;

    // Constructor vacío
    public VehiculoCarga() {
    }

    // Constructor con parámetros
    public VehiculoCarga(String patente, int precioXdia, int cantDias, int capacidadCarga) {
        super(patente, precioXdia, cantDias);
        this.capacidadCarga = capacidadCarga;
    }

    // Getters and setters (ya los tienes)

    // To String (ya lo tienes)

    @Override
    public void mostrarDatos() {
        System.out.println("Vehículo de Carga - Patente: " + getPatente() +
                ", Capacidad de carga: " + capacidadCarga + " kg");
    }

    @Override
    public void mostrarDetalleBoleta() {
        double subtotal = getPrecioXdia() * getCantDias();
        double descuento = subtotal * descCarga;
        double ivaAplicado = (subtotal - descuento) * IVA;
        double total = subtotal - descuento + ivaAplicado;

        System.out.println("Detalle de Boleta - Vehículo de Carga");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + ivaAplicado);
        System.out.println("Total: $" + total);
    }
}