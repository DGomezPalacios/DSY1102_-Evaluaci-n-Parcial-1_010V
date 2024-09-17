package GomezPalaciosDaniela;

import java.util.ArrayList;
import java.util.List;

public class AlmacenamientoVehiculo {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (!existeVehiculo(vehiculo.getPatente())) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo agregado correctamente.");
        } else {
            System.out.println("El vehículo con patente " + vehiculo.getPatente() + " ya existe.");
        }
    }

    public void listarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
        }
    }

    private boolean existeVehiculo(String patente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return true;
            }
        }
        return false;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}