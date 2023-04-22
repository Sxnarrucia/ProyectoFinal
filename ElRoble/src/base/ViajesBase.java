package base;

public class ViajesBase {

    private int id;
    private String fechaDelViaje;
    private String destino;
    private int capacidadDePasajeros;
    private int precioDelTiquete;
    private String numeroPlaca;
    private String idChofer;

    private static int nuevoId;

    private static void setNuevoID() {
        nuevoId++;
    }

    public ViajesBase() {
    }

    public ViajesBase(String fechaDelViaje, String destino, int capacidadDePasajeros, int precioDelTiquete, String numeroPlaca, String idChofer) {
        setNuevoID();
        this.id = nuevoId;
        this.fechaDelViaje = fechaDelViaje;
        this.destino = destino;
        this.capacidadDePasajeros = capacidadDePasajeros;
        this.precioDelTiquete = precioDelTiquete;
        this.numeroPlaca = numeroPlaca;
        this.idChofer = idChofer;
    }
    

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(String idChofer) {
        this.idChofer = idChofer;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public int getPrecioDelTiquete() {
        return precioDelTiquete;
    }

    public void setPrecioDelTiquete(int precioDelTiquete) {
        this.precioDelTiquete = precioDelTiquete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViajesBase{");
        sb.append("id=").append(id);
        sb.append(", fechaDelViaje=").append(fechaDelViaje);
        sb.append(", destino=").append(destino);
        sb.append(", capacidadDePasajeros=").append(capacidadDePasajeros);
        sb.append(", precioDelTiquete=").append(precioDelTiquete);
        sb.append(", numeroPlaca=").append(numeroPlaca);
        sb.append(", idChofer=").append(idChofer);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFechaDelViaje() {
        return fechaDelViaje;
    }

    public void setFechaDelViaje(String fechaDelViaje) {
        this.fechaDelViaje = fechaDelViaje;
    }

}
