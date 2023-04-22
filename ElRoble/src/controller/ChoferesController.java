package controller;

import base.ChoferesBase;
import base.PersonasBase;
import base.UsuariosBase;
import static controller.PersonasController.listaPersona;
import static controller.UsuariosController.listaUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChoferesController {

    public static ArrayList<ChoferesBase> listaChoferes = new ArrayList();

    public void cargarDatos() {
        ChoferesBase chofer1 = new ChoferesBase("123", "Esteban", "6040", "esteban@gmail.com", "26/04");
        ChoferesBase chofer2 = new ChoferesBase("1234", "Jose", "7040", "jose@gmail.com", "26/08");
        listaChoferes.add(chofer1);
        listaChoferes.add(chofer2);
    }

    public void registrarChofer() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID del chofer:");
        ChoferesBase validacion1 = buscarChofer(numeroID);
        if (validacion1 != null) {
            JOptionPane.showMessageDialog(null, "El ID ya está en uso");
        } else {
            UsuariosBase validacion = buscarUsuario(numeroID);
            if (validacion != null) {
                JOptionPane.showMessageDialog(null, "Esta persona ya esta registrada como Usuario");
            } else {
                PersonasBase persona = buscarPersona(numeroID);

                if (persona != null) {
                    String nombre = persona.getNombre();
                    String telefono = persona.getNumeroTelefono();
                    String correo = persona.getCorreo();
                    String vencimientoLicencia = JOptionPane.showInputDialog(null, "Ingrese el vencimiento de la licencia del chofer:");

                    ChoferesBase chofer = new ChoferesBase(numeroID, nombre, telefono, correo, vencimientoLicencia);
                    listaChoferes.add(chofer);

                    JOptionPane.showMessageDialog(null, "Chofer registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "La persona no existe en la lista");
                }
            }
        }

    }

    public void consultarChofer() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID del chofer:");
        ChoferesBase chofer = buscarChofer(numeroID);
        if (chofer != null) {
            JOptionPane.showMessageDialog(null, chofer.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El chofer no existe en la lista.");
        }
    }

    public void editarChofer() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número de ID del chofer:");
        PersonasBase persona = buscarPersona(numeroID);
        ChoferesBase chofer = buscarChofer(numeroID);
        if (persona != null) {
            String[] opciones = {"Numero de ID", "Nombre", "Número de teléfono", "Correo", "Vencimiento de Licencia", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el atributo que desea editar:", "Editar Chofer", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nuevoID = JOptionPane.showInputDialog("Ingrese el nuevo ID:");
                    persona.setNumeroID(nuevoID);
                    chofer.setNumeroID(nuevoID);
                    JOptionPane.showMessageDialog(null, "ID actualizado.");
                    break;
                case 1:
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    persona.setNombre(nuevoNombre);
                    chofer.setNombre(nuevoNombre);
                    JOptionPane.showMessageDialog(null, "Nombre actualizado.");
                    break;
                case 2:
                    String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo número de teléfono:");
                    persona.setNumeroTelefono(nuevoTelefono);
                    chofer.setNumeroTelefono(nuevoTelefono);
                    JOptionPane.showMessageDialog(null, "Teléfono actualizado.");
                    break;
                case 3:
                    String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo:");
                    persona.setCorreo(nuevoCorreo);
                    chofer.setCorreo(nuevoCorreo);
                    JOptionPane.showMessageDialog(null, "Correo actualizado.");
                    break;
                case 4:
                    String nuevoVencimientoLicencia = JOptionPane.showInputDialog("Ingrese el nuevo código:");
                    chofer.setVencimientoLicencia(nuevoVencimientoLicencia);
                    JOptionPane.showMessageDialog(null, "Código actualizado.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Edición cancelada.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún chofer con ese número de ID.");
        }
    }

    public void eliminarChofer() {
        String numeroID = JOptionPane.showInputDialog("Ingrese el número ID del chofer:");
        ChoferesBase chofer = buscarChofer(numeroID);
        if (chofer != null) {
            listaChoferes.remove(chofer);
            JOptionPane.showMessageDialog(null, "Chofer eliminada exitosamente.");

        } else {
            JOptionPane.showMessageDialog(null, "El chofer no existe en la lista.");
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

    public ChoferesBase buscarChofer(String numeroID) {
        for (ChoferesBase chofer : listaChoferes) {
            if (chofer.getNumeroID().equals(numeroID)) {
                return chofer;
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
}
