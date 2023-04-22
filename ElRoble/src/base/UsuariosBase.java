
package base;

public class UsuariosBase extends PersonasBase {
    private String codigo;
    private String clave;

    public UsuariosBase() {
    }

    public UsuariosBase(String codigo, String clave) {
        this.codigo = codigo;
        this.clave = clave;
    }

    public UsuariosBase(String numeroID, String nombre, String numeroTelefono, String correo, String codigo, String clave ) {
        super(numeroID, nombre, numeroTelefono, correo);
        this.codigo = codigo;
        this.clave = clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de ID = ").append(numeroID);
        sb.append("\nNombre = ").append(nombre);
        sb.append("\nNúmero de Teléfono = ").append(numeroTelefono);
        sb.append("\nCorreo = ").append(correo);
        sb.append("\nCódigo = ").append(codigo);
        sb.append("\nClave = ").append(clave);
        return sb.toString();
    }
    
    
}
