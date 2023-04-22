
package base;

public class PersonasBase {
    
    String numeroID;
    String nombre;
    String numeroTelefono;
    String correo;

    public PersonasBase() {
    }

    public PersonasBase(String numeroID, String nombre, String numeroTelefono, String correo) {
        this.numeroID = numeroID;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de ID = ").append(numeroID);
        sb.append("\nNombre = ").append(nombre);
        sb.append("\nNúmero de Teléfono = ").append(numeroTelefono);
        sb.append("\nCorreo = ").append(correo);
        return sb.toString();
    }
}