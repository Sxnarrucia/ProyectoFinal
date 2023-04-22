/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import base.ChoferesBase;
import base.VehiculosBase;
import base.ViajesBase;
import static controller.ChoferesController.listaChoferes;
import static controller.VehiculosController.listaVehiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ViajesController {

    public static ArrayList<ViajesBase> listaViajes = new ArrayList<>();

    public void cargarDatos() {
        ViajesBase viaje1 = new ViajesBase("26/07/22", "San Jose", buscarVehiculo("ABC123").getCapacidad(), 2500, "ABC123", "123");
        ViajesBase viaje2 = new ViajesBase("26/12/22", "Cartago", buscarVehiculo("ABC123").getCapacidad(), 5000, "DEF867", "123");
        listaViajes.add(viaje1);
        listaViajes.add(viaje2);
    }

    public void registrarViaje() {
        String fechaDelViaje = JOptionPane.showInputDialog("Ingrese la fecha del viaje (dd/MM/yyyy):");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del viaje:");
        int precioDelTiquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del tiquete:"));
        String idChofer = JOptionPane.showInputDialog("Ingrese el ID del chofer que va a realizar el viaje:");
        String numeroPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del bus que va a realizar el viaje:");
        int capacidadDePasajero = buscarVehiculo(numeroPlaca).getCapacidad();
        ViajesBase nuevoViaje = new ViajesBase(fechaDelViaje, destino, capacidadDePasajero, precioDelTiquete, numeroPlaca, idChofer);
        listaViajes.add(nuevoViaje);
        JOptionPane.showMessageDialog(null, "Viaje registrado con éxito");
    }

    public void consultarViaje() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del viaje a consultar:"));

        for (ViajesBase viaje : listaViajes) {
            if (viaje.getId() == id) {
                JOptionPane.showMessageDialog(null, viaje.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el viaje con el ID proporcionado");
    }

    public void editarViaje() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del viaje"));

        for (ViajesBase viaje : listaViajes) {
            if (viaje.getId() == id) {
                String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del viaje (dd/MM/yyyy):");
                String nuevoDestino = JOptionPane.showInputDialog("Ingrese el nuevo destino del viaje:");
                int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio del tiquete:"));

                viaje.setFechaDelViaje(nuevaFecha);
                viaje.setDestino(nuevoDestino);
                viaje.setPrecioDelTiquete(nuevoPrecio);

                JOptionPane.showMessageDialog(null, "Viaje actualizado con éxito");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el viaje con el ID proporcionado");
    }

    public void eliminarViaje() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del viaje a eliminar:"));

        for (ViajesBase viaje : listaViajes) {
            if (viaje.getId() == id) {
                listaViajes.remove(viaje);
                JOptionPane.showMessageDialog(null, "Viaje eliminado con éxito");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró el viaje con el ID proporcionado");
    }

    public ChoferesBase buscarChofer(String numeroID) {
        for (ChoferesBase chofer : listaChoferes) {
            if (chofer.getNumeroID().equals(numeroID)) {
                return chofer;
            }
        }
        return null;
    }

    public VehiculosBase buscarVehiculo(String numeroPlaca) {
        for (VehiculosBase vehiculo : listaVehiculos) {
            if (vehiculo.getNumeroPlaca().equals(numeroPlaca)) {
                return vehiculo;
            }
        }
        return null;
    }

    public ViajesBase buscarViaje(String idChofer) {
        for (ViajesBase viaje : listaViajes) {
            if (viaje.getIdChofer().equals(idChofer)) {
                return viaje;
            }
        }
        return null;
    }

}
