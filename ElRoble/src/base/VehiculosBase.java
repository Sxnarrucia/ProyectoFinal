
package base;

public class VehiculosBase {
    private String numeroPlaca;
    private String marca;
    private String estilo;
    private String modelo;
    private int capacidad;   
    private int vendidos;
    
    public VehiculosBase(){
    }

    public VehiculosBase(String numeroPlaca, String marca, String estilo, String modelo, int capacidad, int vendidos) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.estilo = estilo;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.vendidos = vendidos;
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

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehiculosBase{");
        sb.append("numeroPlaca=").append(numeroPlaca);
        sb.append(", marca=").append(marca);
        sb.append(", estilo=").append(estilo);
        sb.append(", modelo=").append(modelo);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", vendidos=").append(vendidos);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}


