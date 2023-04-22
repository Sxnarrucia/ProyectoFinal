package controller;

import base.VehiculosBase;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VehiculosController {

    public static ArrayList<VehiculosBase> listaVehiculos = new ArrayList();

    public void cargarDatos() {
        VehiculosBase vehiculo1 = new VehiculosBase("abc123", "Mercedes Benz", "Microbus", "2022", 15,0);
        VehiculosBase vehiculo2 = new VehiculosBase("def867", "Mercedes Benz", "Autobus", "2023", 35,0);
        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);
    }

    public void registrarVehiculo() {
        String numeroPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String estilo = JOptionPane.showInputDialog("Ingrese el estilo del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del vehículo:"));

        VehiculosBase vehiculo = new VehiculosBase(numeroPlaca, marca, estilo, modelo, capacidad,0);
        listaVehiculos.add(vehiculo);

        JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
    }

    public void consultarVehiculo() {
        String numeroPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del vehículo:");
        VehiculosBase vehiculo = buscarVehiculo(numeroPlaca);
        if (vehiculo != null) {
            JOptionPane.showMessageDialog(null, vehiculo.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no existe en la lista.");
        }
    }

    public void editarVehiculo() {
        String numeroPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del vehículo:");
        VehiculosBase vehiculo = buscarVehiculo(numeroPlaca);
        if (vehiculo != null) {
            String[] opciones = {"Placa", "Marca", "Estilo", "Modelo", "Capacidad", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el atributo que desea editar:", "Editar Vehículo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nuevaPlaca = JOptionPane.showInputDialog("Ingrese la nueva placa:");
                    vehiculo.setNumeroPlaca(nuevaPlaca);
                    JOptionPane.showMessageDialog(null, "Placa actualizado.");
                    break;
                case 1:
                    String nuevaMarca = JOptionPane.showInputDialog("Ingrese la nueva marca:");
                    vehiculo.setMarca(nuevaMarca);
                    JOptionPane.showMessageDialog(null, "Marca actualizada.");
                    break;
                case 2:
                    String nuevoEstilo = JOptionPane.showInputDialog("Ingrese el nuevo estilo:");
                    vehiculo.setEstilo(nuevoEstilo);
                    JOptionPane.showMessageDialog(null, "Estilo actualizado.");
                    break;
                case 3:
                    String nuevoModelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo:");
                    vehiculo.setModelo(nuevoModelo);
                    JOptionPane.showMessageDialog(null, "Modelo actualizado.");
                    break;
                case 4:
                    int nuevaCapacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva capacidad del vehículo:"));
                    vehiculo.setCapacidad(nuevaCapacidad);
                    JOptionPane.showMessageDialog(null, "Color actualizado.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Edición cancelada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún vehiculo con ese número de chasis.");
        }
    }

    public void eliminarVehiculo() {
        String numeroPlaca = JOptionPane.showInputDialog("Ingrese el número de placa del vehículo:");
        VehiculosBase vehiculo = buscarVehiculo(numeroPlaca);
        if (vehiculo != null) {
            listaVehiculos.remove(vehiculo);
            JOptionPane.showMessageDialog(null, "Vehículo eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no existe en la lista.");
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
