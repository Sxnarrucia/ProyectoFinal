package main;

import controller.ChoferesController;
import controller.MenuAdminController;
import controller.MenuVentasController;
import controller.Metodos;
import controller.PersonasController;
import controller.UsuariosController;
import controller.VehiculosController;
import controller.ViajesController;
import javax.swing.JOptionPane;

public class main {

    public static ChoferesController chofer = new ChoferesController();
    public static PersonasController persona = new PersonasController();
    public static UsuariosController usuario = new UsuariosController();
    public static VehiculosController vehiculo = new VehiculosController();
    public static ViajesController viaje = new ViajesController();
    public static Metodos metodo = new Metodos();
    public static MenuAdminController menuAdmin = new MenuAdminController();
    public static MenuVentasController menuVentas = new MenuVentasController();

    public static void main(String[] args) {
        chofer.cargarDatos();
        persona.cargarDatos();
        usuario.cargarDatos();
        vehiculo.cargarDatos();
        viaje.cargarDatos();
        String user = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario");
        String password = JOptionPane.showInputDialog(null, "Ingrese su contrasenia");
        if (user.equals("admin") && password.equals("admin")) {
            Menu();
        } else {
            JOptionPane.showMessageDialog(null, "Su usuario o contrasenia son incorrectos");
        }

    }

    private static void Menu() {
        String[] opciones = {"Administracion", "Ventas"};
        String msg = "Bienvenido al Menu Principal de El Roble";
        String titulo = "Menu Principal ";

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodo.menuBotones(msg, titulo, opciones, "Salir");
            if (opcion == 0) {
                SubMenuAdministracion();
            } else if (opcion == 1) {
                SubMenuVentas();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres salir?", "Salir");
                if (respuesta == 0) {
                    metodo.msg("Gracias por usar el programa del Roble !");
                    System.exit(0);
                } else {
                    Menu();
                }
            }
        }

    }

    public static void SubMenuAdministracion() {
        String[] opciones = {"Vehiculos", "Personas", "Choferes", "Usuarios"};
        String msg = "Bienvenido al Menu Principal de Administracion";
        String titulo = "Menu Principal de Administracion";

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodo.menuBotones(msg, titulo, opciones, "Salir");
            if (opcion == 0) {
                menuAdmin.MenuVehiculos();
            } else if (opcion == 1) {
                menuAdmin.MenuPersonas();
            } else if (opcion == 2) {
                menuAdmin.MenuChoferes();
            } else if (opcion == 3) {
                menuAdmin.MenuUsuarios();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres salir?", "Salir");

                if (respuesta == 0) {
                    Menu();
                } else {
                    SubMenuAdministracion();
                }
            }
        }

    }

    public static void SubMenuVentas() {
        String[] opciones = {"Viajes", "Tiquetes"};
        String msg = "Bienvenido al Menu Principal de Ventas";
        String titulo = "Menu Principal de Ventas";

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodo.menuBotones(msg, titulo, opciones, "Salir");
            if (opcion == 0) {
                menuVentas.MenuViajes();
            } else if (opcion == 1) {
                menuVentas.MenuTiquetes();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres salir?", "Salir");
                if (respuesta == 0) {
                    Menu();
                } else {
                    SubMenuVentas();
                }
            }
        }

    }
}
