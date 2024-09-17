package GomezPalaciosDaniela;

public abstract class Vehiculo {
    private String patente;
    private int precioXdia;
    private int cantDias;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String patente, int precioXdia, int cantDias) {
        this.patente = patente;
        this.precioXdia = precioXdia;
        this.cantDias = cantDias;
    }

    // Getters y setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPrecioXdia() {
        return precioXdia;
    }

    public void setPrecioXdia(int precioXdia) {
        this.precioXdia = precioXdia;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    // Método abstracto que deben implementar las clases hijas
    public abstract void mostrarDatos();

    // Método toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", precioXdia=" + precioXdia +
                ", cantDias=" + cantDias +
                '}';
    }
}