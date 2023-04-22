package controller;

import javax.swing.JOptionPane;
import main.main;

public class MenuVentasController {

    public static Metodos metodo = new Metodos();
    public static ViajesController viaje = new ViajesController();
    public static TiquetesController tiquete = new TiquetesController();
    public static main menus = new main();

    public void MenuViajes() {
        String[] opcionesViajes = {"Registrar Viaje", "Consultar Viaje", "Editar Viaje", "Eliminar Viaje", "Volver"};

        int opcionViajes = -1;
        while (opcionViajes != opcionesViajes.length - 1) {
            opcionViajes = metodo.menuBotones("Seleccione una opción", "Sub menú Viajes", opcionesViajes, "Volver");

            if (opcionViajes == 0) {
                viaje.registrarViaje();
            } else if (opcionViajes == 1) {
                viaje.consultarViaje();
            } else if (opcionViajes == 2) {
                viaje.editarViaje();
            } else if (opcionViajes == 3) {
                viaje.eliminarViaje();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Viajes", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuVentas();
                } else {
                    MenuViajes();
                }
            }
        }
    }

    public void MenuTiquetes() {
        String[] opcionesTiquetes = { "Registrar Venta", "Anular Venta", "Consuitar Venta", "Informe General", "Volver"};

        int opcionTiquetes = -1;
        while (opcionTiquetes != opcionesTiquetes.length - 1) {
            opcionTiquetes = metodo.menuBotones("Seleccione una opción", "Sub menú Viajes", opcionesTiquetes, "Volver");

            if (opcionTiquetes == 0) {
                tiquete.RegistrarVenta();
            } else if (opcionTiquetes == 1) {
                tiquete.AnularVenta();
            } else if (opcionTiquetes == 2) {
                tiquete.ConsultarVenta();
            } else if (opcionTiquetes == 3) {
                tiquete.InformeVenta();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Viajes", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuVentas();
                } else {
                    MenuTiquetes();
                }
            }
        }
    }
}
