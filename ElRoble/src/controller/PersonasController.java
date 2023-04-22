package controller;

import base.ChoferesBase;
import base.PersonasBase;
import base.UsuariosBase;
import static controller.ChoferesController.listaChoferes;
import static controller.UsuariosController.listaUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonasController {

    public static ArrayList<PersonasBase> listaPersona = new ArrayList();

    public void cargarDatos() {
        PersonasBase persona1 = new PersonasBase("12345", "Marco", "9070", "marco@gmail.com");
        PersonasBase persona2 = new PersonasBase("123456", "Mario", "9870", "mario@gmail.com");
        listaPersona.add(persona1);
        listaPersona.add(persona2);
    }

    public void registrarPersona() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID de la persona:");
        PersonasBase validacion = buscarPersona(numeroID);
        if (validacion != null) {
            JOptionPane.showMessageDialog(null, "El ID ya está en uso");
        } else {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
            String numeroTelefono = JOptionPane.showInputDialog("Ingrese el número de teléfono de la persona:");
            String correo = JOptionPane.showInputDialog("Ingrese el correo de la persona:");

            PersonasBase persona = new PersonasBase(numeroID, nombre, numeroTelefono, correo);
            listaPersona.add(persona);

            JOptionPane.showMessageDialog(null, "Persona registrada exitosamente.");
        }

    }

    public void consultarPersona() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID de la persona:");
        PersonasBase persona = buscarPersona(numeroID);
        if (persona != null) {
            JOptionPane.showMessageDialog(null, persona.toString());
        } else {
            JOptionPane.showMessageDialog(null, "La persona no existe en la lista.");
        }
    }

    public void editarPersona() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID de la persona:");
        PersonasBase persona = buscarPersona(numeroID);
        if (persona != null) {
            String[] opciones = {"Numero de ID", "Nombre", "Número de teléfono", "Correo", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el atributo que desea editar:", "Editar Persona", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nuevoID = JOptionPane.showInputDialog("Ingrese el nuevo ID:");
                    persona.setNumeroID(nuevoID);
                    JOptionPane.showMessageDialog(null, "ID actualizado.");
                    break;
                case 1:
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    persona.setNombre(nuevoNombre);
                    JOptionPane.showMessageDialog(null, "Nombre actualizado.");
                    break;
                case 2:
                    String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo número de teléfono:");
                    persona.setNumeroTelefono(nuevoTelefono);
                    JOptionPane.showMessageDialog(null, "Teléfono actualizado.");
                    break;
                case 3:
                    String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo:");
                    persona.setCorreo(nuevoCorreo);
                    JOptionPane.showMessageDialog(null, "Correo actualizado.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Edición cancelada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna persona con ese número de ID.");
        }
    }

    public void eliminarPersona() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número ID de la persona:");
        PersonasBase persona = buscarPersona(numeroID);
        UsuariosBase usuario = buscarUsuario(numeroID);
        ChoferesBase chofer = buscarChofer(numeroID);
        if (persona != null) {
            listaPersona.remove(persona);
            JOptionPane.showMessageDialog(null, "Persona eliminada exitosamente.");
            if (usuario != null) {
                listaUsuarios.remove(usuario);
            }
            if (chofer != null) {
                listaChoferes.remove(chofer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La persona no existe en la lista.");
        }

    }

    public PersonasBase buscarPersona(String numeroID) {
        for (PersonasBase persona : listaPersona) {
            if (persona.getNumeroID().equals(numeroID)) {
                return persona;
            }
        }
        return null;
    }

    public UsuariosBase buscarUsuario(String numeroID) {
        for (UsuariosBase usuario : listaUsuarios) {
            if (usuario.getNumeroID().equals(numeroID)) {
                return usuario;
            }
        }
        return null;
    }

    public ChoferesBase buscarChofer(String numeroID) {
        for (ChoferesBase chofer : listaChoferes) {
            if (chofer.getNumeroID().equals(numeroID)) {
                return chofer;
            }
        }
        return null;
    }
}
