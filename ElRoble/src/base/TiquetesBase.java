package base;

import java.util.Date;

public class TiquetesBase {

    private String idViaje;
    private String cantidad;
    private String precio;
    private Date fechaVenta;
    private int ventaBruta;
    private int IVA;
    private int precioTotal;
    

    public TiquetesBase() {
    }

    public TiquetesBase(String idViaje, String cantidad, String precio, Date fechaVenta, int ventaBruta, int IVA, int precioTotal) {
        this.idViaje = idViaje;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaVenta = fechaVenta;
        this.ventaBruta = ventaBruta;
        this.IVA = IVA;
        this.precioTotal = precioTotal;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
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
