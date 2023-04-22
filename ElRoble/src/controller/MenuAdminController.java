package controller;

import main.main;

public class MenuAdminController {

    public static Metodos metodo = new Metodos();
    public static VehiculosController vehiculo = new VehiculosController();
    public static ChoferesController chofer = new ChoferesController();
    public static PersonasController persona = new PersonasController();
    public static UsuariosController usuario = new UsuariosController();
    public static main menus = new main();

    public void MenuVehiculos() {
        String[] opcionesAutos = {"Registrar", "Consultar", "Editar", "Eliminar", "Volver"};

        int opcionVehiculos = -1;
        while (opcionVehiculos != opcionesAutos.length - 1) {
            opcionVehiculos = metodo.menuBotones("Seleccione una opción", "Sub menú Autos", opcionesAutos, "Volver");

            if (opcionVehiculos == 0) {
                vehiculo.registrarVehiculo();
            } else if (opcionVehiculos == 1) {
                vehiculo.consultarVehiculo();
            } else if (opcionVehiculos == 2) {
                vehiculo.editarVehiculo();
            } else if (opcionVehiculos == 3) {
                vehiculo.eliminarVehiculo();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Administracion", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuAdministracion();
                } else {
                    MenuVehiculos();
                }
            }
        }
    }

    public void MenuPersonas() {
        String[] opcionesPersonas = {"Registrar", "Consultar", "Editar", "Eliminar", "Volver"};

        int opcionPersonas = -1;
        while (opcionPersonas != opcionesPersonas.length - 1) {
            opcionPersonas = metodo.menuBotones("Seleccione una opción", "Sub menú Autos", opcionesPersonas, "Volver");

            if (opcionPersonas == 0) {
                persona.registrarPersona();
            } else if (opcionPersonas == 1) {
                persona.consultarPersona();
            } else if (opcionPersonas == 2) {
                persona.editarPersona();
            } else if (opcionPersonas == 3) {
                persona.eliminarPersona();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Administracion", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuAdministracion();
                } else {
                    MenuPersonas();
                }
            }
        }
    }

    public void MenuChoferes() {
        String[] opcionesChoferes = {"Registrar", "Consultar", "Editar", "Eliminar", "Volver"};

        int opcionChoferes = -1;
        while (opcionChoferes != opcionesChoferes.length - 1) {
            opcionChoferes = metodo.menuBotones("Seleccione una opción", "Sub menú Autos", opcionesChoferes, "Volver");

            if (opcionChoferes == 0) {
                chofer.registrarChofer();
            } else if (opcionChoferes == 1) {
                chofer.consultarChofer();
            } else if (opcionChoferes == 2) {
                chofer.editarChofer();
            } else if (opcionChoferes == 3) {
                chofer.eliminarChofer();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Administracion", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuAdministracion();
                } else {
                    MenuChoferes();
                }
            }
        }
    }

    public void MenuUsuarios() {
        String[] opcionesUsuarios = {"Registrar", "Consultar", "Editar", "Eliminar", "Volver"};

        int opcionUsuarios = -1;
        while (opcionUsuarios != opcionesUsuarios.length - 1) {
            opcionUsuarios = metodo.menuBotones("Seleccione una opción", "Sub menú Autos", opcionesUsuarios, "Volver");

            if (opcionUsuarios == 0) {
                usuario.registrarUsuario();
            } else if (opcionUsuarios == 1) {
                usuario.consultarUsuario();
            } else if (opcionUsuarios == 2) {
                usuario.editarUsuario();
            } else if (opcionUsuarios == 3) {
                usuario.eliminarUsuario();
            } else {
                int respuesta = new Metodos().SIoNo("¿Estás seguro de que quieres volver al Menu de Administracion", "Salir");

                if (respuesta == 0) {
                    menus.SubMenuAdministracion();
                } else {
                    MenuUsuarios();
                }
            }
        }
    }
}
