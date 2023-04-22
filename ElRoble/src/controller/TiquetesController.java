package controller;

import base.ChoferesBase;
import base.TiquetesBase;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import base.VehiculosBase;
import static controller.ChoferesController.listaChoferes;
import static controller.VehiculosController.listaVehiculos;
import java.util.Date;

public class TiquetesController {

    public static ArrayList<TiquetesBase> listaTiquetes = new ArrayList();
    public static VehiculosController vehiculo = new VehiculosController();
    public static ViajesController viaje = new ViajesController();

    public TiquetesBase buscarTiquete(int id) {
        for (TiquetesBase tiquete : listaTiquetes) {
            if (tiquete.getIdViaje() == id) {
                return tiquete;
            }
        }
        return null;
    }

    public void validarEspacios(int cantidad, String placa) {
        int vendidos = 0;
        vendidos = vehiculo.buscarVehiculo(placa).getVendidos() + cantidad;
        if (vendidos <= vehiculo.buscarVehiculo(placa).getCapacidad()) {
            JOptionPane.showMessageDialog(null, "El numero de tiquetes ingresados puede ser adquirido");
            buscarVehiculo(placa).setVendidos(vendidos);
        } else {
            JOptionPane.showMessageDialog(null, "El numero de tiquetes ingresados supera la capacidad actual del vehiculo");
            RegistrarVenta();
        }
    }

    public void RegistrarVenta() {
        boolean posible = false;
        String data = "";
        for (ChoferesBase indexVenta : listaChoferes) {
            data = data + (" ID " + indexVenta.getNumeroID() + " Nombre " + indexVenta.getNombre() + "\n");
        }
        String data1 = "";
        for (VehiculosBase indexVenta : listaVehiculos) {
            data1 = data1 + (" Placa " + indexVenta.getNumeroPlaca() + " Marca " + indexVenta.getMarca() + " Estilo " + indexVenta.getEstilo() + " Modelo " + indexVenta.getModelo() + " Capacidad " + indexVenta.getCapacidad() + "Asientos vendidos" + indexVenta.getVendidos() + "\n");
        }
        JOptionPane.showMessageDialog(null, "Estos son los choferes disponibles");
        JOptionPane.showMessageDialog(null, data, "Choferes", JOptionPane.NO_OPTION);
        JOptionPane.showMessageDialog(null, "Estos son los vehiculos disponibles");
        JOptionPane.showMessageDialog(null, data1, "Vehiculos", JOptionPane.NO_OPTION);
        String idChofer = JOptionPane.showInputDialog(null, "Ingrese el ID del chofer con el que desea realizar el viaje");
        String placa = JOptionPane.showInputDialog(null, "Ingrese la placa del vehiculo donde desea viajar ");
        int idViaje = viaje.buscarViaje(idChofer).getId();
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de tiquetes que desea obtener"));
        double precio = viaje.buscarViaje(idChofer).getPrecioDelTiquete()*cantidad;
        Date fecha = new Date();
        double IVA = 0.13;
        double ventaBruta = precio * IVA;
        double total = precio + ventaBruta;
        validarEspacios(cantidad, placa);
        TiquetesBase tiquete = new TiquetesBase(idViaje, cantidad, precio, fecha, ventaBruta, IVA, total);
        listaTiquetes.add(tiquete);
        JOptionPane.showMessageDialog(null, "Venta registrada con exito");
    }

    public void AnularVenta() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de viaje de la venta que desea anular"));
        TiquetesBase tiquete = buscarTiquete(id);
        if (tiquete != null) {
            listaTiquetes.remove(tiquete);
            JOptionPane.showMessageDialog(null, "Tiquete eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El tiquete no existe en la lista.");
        }
    }

    public void ConsultarVenta() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de viaje de la venta que desea consultar"));
        TiquetesBase tiquete = buscarTiquete(id);
        if (tiquete != null) {
            JOptionPane.showMessageDialog(null, tiquete.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El tiquete no existe en la lista.");
        }
    }

    public void InformeVenta() {
        JOptionPane.showMessageDialog(null, "Este es un informe resumen");
        String data = "";
        for (VehiculosBase indexVenta : listaVehiculos) {
            int disponibles = indexVenta.getCapacidad() - indexVenta.getVendidos();
            data = data + (" Capacidad del autobus " + indexVenta.getCapacidad() + " Asientos Vendidos " + indexVenta.getVendidos() + " Disponibilidad de espacios " + disponibles + "\n");
            JOptionPane.showMessageDialog(null, data, "Informe", JOptionPane.NO_OPTION);
        }
    }

    public VehiculosBase buscarVehiculo(String numeroPlaca) {
        for (VehiculosBase vehiculo : listaVehiculos) {
            if (vehiculo.getNumeroPlaca().equals(numeroPlaca)) {
                return vehiculo;
            }
        }
        return null;
    }
}
