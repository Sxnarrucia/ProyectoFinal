package controller;

import base.ChoferesBase;
import base.PersonasBase;
import base.UsuariosBase;
import static controller.ChoferesController.listaChoferes;
import static controller.PersonasController.listaPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuariosController {

    public static ArrayList<UsuariosBase> listaUsuarios = new ArrayList();

    public void cargarDatos() {
        UsuariosBase usuario1 = new UsuariosBase("4657", "Javier", "767676", "javier@gmail.com", "6575749", "7575");
        UsuariosBase usuario2 = new UsuariosBase("868686", "Jorge", "86868", "jorge@gmail.com", "8445802", "85769");
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
    }

    public void registrarUsuario() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID del Usuario:");
        UsuariosBase validacion = buscarUsuario(numeroID);
        if (validacion != null) {
            JOptionPane.showMessageDialog(null, "El ID ya está en uso");
        } else {
            ChoferesBase validacion1 = buscarChofer(numeroID);
            if (validacion1 != null) {
                JOptionPane.showMessageDialog(null, "Esta persona ya esta registrada como Chofer");
            } else {
                PersonasBase persona = buscarPersona(numeroID);

                if (persona != null) {
                    String nombre = persona.getNombre();
                    String telefono = persona.getNumeroTelefono();
                    String correo = persona.getCorreo();
                    String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del usuario:");
                    String clave = JOptionPane.showInputDialog(null, "Ingrese la clave del usuario:");

                    UsuariosBase usuario = new UsuariosBase(numeroID, nombre, telefono, correo, codigo, clave);
                    listaUsuarios.add(usuario);

                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "La persona no existe en la lista");
                }
            }
        }

    }

    public void consultarUsuario() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID del usuario:");
        UsuariosBase usuario = buscarUsuario(numeroID);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, usuario.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe en la lista.");
        }
    }

    public void editarUsuario() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID de la persona:");
        PersonasBase persona = buscarPersona(numeroID);
        UsuariosBase usuario = buscarUsuario(numeroID);
        if (persona != null) {
            String[] opciones = {"Numero de ID", "Nombre", "Número de teléfono", "Correo", "Codigo", "Clave", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el atributo que desea editar:", "Editar Usuario", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nuevoID = JOptionPane.showInputDialog("Ingrese el nuevo ID:");
                    persona.setNumeroID(nuevoID);
                    usuario.setNumeroID(nuevoID);
                    JOptionPane.showMessageDialog(null, "ID actualizado.");
                    break;
                case 1:
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    persona.setNombre(nuevoNombre);
                    usuario.setNombre(nuevoNombre);
                    JOptionPane.showMessageDialog(null, "Nombre actualizado.");
                    break;
                case 2:
                    String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo número de teléfono:");
                    persona.setNumeroTelefono(nuevoTelefono);
                    usuario.setNumeroTelefono(nuevoTelefono);
                    JOptionPane.showMessageDialog(null, "Teléfono actualizado.");
                    break;
                case 3:
                    String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo:");
                    persona.setCorreo(nuevoCorreo);
                    usuario.setCorreo(nuevoCorreo);
                    JOptionPane.showMessageDialog(null, "Correo actualizado.");
                    break;
                case 4:
                    String nuevoCodigo = JOptionPane.showInputDialog("Ingrese el nuevo código:");
                    usuario.setCodigo(nuevoCodigo);
                    JOptionPane.showMessageDialog(null, "Código actualizado.");
                    break;
                case 5:
                    String nuevaClave = JOptionPane.showInputDialog("Ingrese la nueva clave:");
                    usuario.setClave(nuevaClave);
                    JOptionPane.showMessageDialog(null, "Clave actualizada.");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Edición cancelada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con ese número de ID.");
        }
    }

    public void eliminarUsuario() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número ID del usuario:");
        UsuariosBase usuario = buscarUsuario(numeroID);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");

        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe en la lista.");
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
