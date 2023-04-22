package base;

import java.util.Date;

public class TiquetesBase {

    private int idViaje;
    private int cantidad;
    private int precio;
    private Date fechaVenta;
    private int ventaBruta;
    private int IVA;
    private int precioTotal;
    

    public TiquetesBase() {
    }

    public TiquetesBase(int idViaje, int cantidad, int precio, Date fechaVenta, int ventaBruta, int IVA, int precioTotal) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getVentaBruta() {
        return ventaBruta;
    }

    public void setVentaBruta(int ventaBruta) {
        this.ventaBruta = ventaBruta;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
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
