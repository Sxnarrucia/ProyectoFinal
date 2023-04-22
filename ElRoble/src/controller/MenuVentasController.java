package controller;

import javax.swing.JOptionPane;

public class MenuVentasController {

    public void ViajesController() {
        ViajesController viaje = new ViajesController();
        String[] opciones = {" Registrar Viaje ", " Consultar Viaje ", " Editar Viaje ", " Eliminar Viaje ", " Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione la opción", "Viajes", 0, 1, null, opciones, opciones);
        switch (opcion) {
            case 0:
                viaje.registrarViaje();
                break;
            case 1:
                viaje.consultarViaje();
                break;
            case 2:
                viaje.editarViaje();
                break;
            case 3:
                viaje.eliminarViaje();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Volver al menú principal");
                break;
        }
    }
}
