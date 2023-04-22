
package base;

public class VehiculosBase {
    private String numeroPlaca;
    private String marca;
    private String estilo;
    private String modelo;
    private int capacidad;    
    
    public VehiculosBase(){
    }

    public VehiculosBase(String numeroPlaca, String marca, String estilo, String modelo, int capacidad) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.estilo = estilo;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de Placa = ").append(numeroPlaca);
        sb.append("\nMarca = ").append(marca);
        sb.append("\nEstilo = ").append(estilo);
        sb.append("\nModelo = ").append(modelo);
        sb.append("\nCapacidad = ").append(capacidad);
        return sb.toString();
    }
    
    
    
    
    
}


