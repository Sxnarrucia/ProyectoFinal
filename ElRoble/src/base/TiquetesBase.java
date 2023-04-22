package base;

import java.util.Date;

public class TiquetesBase {

    private int idViaje;
    private int cantidad;
    private double precio;
    private Date fechaVenta;
    private double ventaBruta;
    private double IVA;
    private double precioTotal;
    

    public TiquetesBase() {
    }

    public TiquetesBase(int idViaje, int cantidad, double precio, Date fechaVenta, double ventaBruta, double IVA, double precioTotal) {
        this.idViaje = idViaje;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaVenta = fechaVenta;
        this.ventaBruta = ventaBruta;
        this.IVA = IVA;
        this.precioTotal = precioTotal;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getVentaBruta() {
        return ventaBruta;
    }

    public void setVentaBruta(double ventaBruta) {
        this.ventaBruta = ventaBruta;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TiquetesBase{");
        sb.append("idViaje=").append(idViaje);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append(", ventaBruta=").append(ventaBruta);
        sb.append(", IVA=").append(IVA);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }



}
