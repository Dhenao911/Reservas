package Reservas;

public class computadorPortatil {

    private String serial;
    private String marca;
    private double pulgadas;
    private double precio;

    public computadorPortatil(String Serial, String Marca, double Pulgadas, double Precio) {
        Serial = Serial;
        marca = Marca;
        pulgadas = Pulgadas;
        precio = Precio;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String Serial) {
        serial = Serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        marca = Marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double Pulgadas) {
        pulgadas = Pulgadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double Precio) {
        precio = Precio;
    }
    
}
