package GomezPalaciosDaniela;

public class VehiculoPasajeros extends Vehiculo implements IntVehiculo {
    private int cantPasajeros;

    // Constructor vacío
    public VehiculoPasajeros() {
    }

    // Constructor con parámetros
    public VehiculoPasajeros(String patente, int precioXdia, int cantDias, int cantPasajeros) {
        super(patente, precioXdia, cantDias);
        this.cantPasajeros = cantPasajeros;
    }

    // Getters and setters

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }


    // To string


    @Override
    public String toString() {
        return "VehiculoPasajeros{" +
                "cantPasajeros=" + cantPasajeros +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Vehículo de Pasajeros - Patente: " + getPatente() +
                ", Capacidad de pasajeros: " + cantPasajeros);
    }

    @Override
    public void mostrarDetalleBoleta() {
        double subtotal = getPrecioXdia() * getCantDias();
        double descuento = subtotal * descPasajero;
        double ivaAplicado = (subtotal - descuento) * IVA;
        double total = subtotal - descuento + ivaAplicado;

        System.out.println("Detalle de Boleta - Vehículo de Pasajeros");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA: $" + ivaAplicado);
        System.out.println("Total: $" + total);
    }
}