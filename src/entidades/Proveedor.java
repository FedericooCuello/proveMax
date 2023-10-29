
package entidades;

public class Proveedor {
    private int idProvedor;
    private String razonSocial;
    private String domicilio;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProvedor, String razonSocial, String domicilio, String telefono) {
        this.idProvedor = idProvedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Proveedor(String razonSocial, String domicilio, String telefono) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProvedor=" + idProvedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }

}
