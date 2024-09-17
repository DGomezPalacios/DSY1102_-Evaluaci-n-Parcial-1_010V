package GomezPalaciosDaniela;

public class Main {
    public static void main(String[] args) {
        AlmacenamientoVehiculo almacenamiento = new AlmacenamientoVehiculo();

        // Agregar un vehículo de carga
        VehiculoCarga vehiculoCarga = new VehiculoCarga("ABC123", 50000, 5, 5000);
        VehiculoCarga vehiculoCarga2 =new VehiculoCarga("XCVB23", 35000, 10, 2000);
        VehiculoCarga vehiculoCarga3 = new VehiculoCarga("ABC123", 40000, 15, 3000);

        almacenamiento.agregarVehiculo(vehiculoCarga);
        almacenamiento.agregarVehiculo(vehiculoCarga2);
        almacenamiento.agregarVehiculo(vehiculoCarga3);

        // Agregar un vehículo de pasajeros
        VehiculoPasajeros vehiculoPasajeros = new VehiculoPasajeros("XYZ789", 30000, 3, 4);
        VehiculoPasajeros vehiculoPasajeros2 = new VehiculoPasajeros("GHIJ67", 50000, 10, 8);

        almacenamiento.agregarVehiculo(vehiculoPasajeros);
        almacenamiento.agregarVehiculo(vehiculoPasajeros2);

        // Listar los vehículos
        System.out.println("Lista de vehículos:");
        almacenamiento.listarVehiculos();

        // Mostrar las boletas de pago de cada vehículo
        System.out.println("\nBoletas de pago:");
        for (Vehiculo vehiculo : almacenamiento.getVehiculos()) {
            vehiculo.mostrarDatos();
            ((IntVehiculo) vehiculo).mostrarDetalleBoleta();
            System.out.println();
        }
    }
}