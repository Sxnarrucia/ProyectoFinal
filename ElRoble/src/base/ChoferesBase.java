
package base;

public class ChoferesBase extends PersonasBase {
    private String vencimientoLicencia;

    public ChoferesBase() {
    }

    public ChoferesBase(String vencimientoLicencia) {
        this.vencimientoLicencia = vencimientoLicencia;
    }

    public ChoferesBase(String numeroID, String nombre, String numeroTelefono, String correo,String vencimientoLicencia) {
        super(numeroID, nombre, numeroTelefono, correo);
        this.vencimientoLicencia = vencimientoLicencia;
    }

    public String getVencimientoLicencia() {
        return vencimientoLicencia;
    }

    public void setVencimientoLicencia(String vencimientoLicencia) {
        this.vencimientoLicencia = vencimientoLicencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de ID = ").append(numeroID);
        sb.append("\nNombre = ").append(nombre);
        sb.append("\nNúmero de Teléfono = ").append(numeroTelefono);
        sb.append("\nCorreo = ").append(correo);
        sb.append("\nVencimiento de la lincencia = ").append(vencimientoLicencia);
        return sb.toString();
    }  
}
