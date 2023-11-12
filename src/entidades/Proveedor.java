
package entidades;

public class Proveedor {
    private int idProvedor;
    private String nombre;
    private String razonSocial;
    private String domicilio;
    private String telefono;
    private boolean estado;

    public Proveedor() {
    }

    public Proveedor(int idProvedor, String nombre,String razonSocial, String domicilio, String telefono, boolean estado) {
        this.idProvedor = idProvedor;
        this.nombre= nombre;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado=true;
    }

    public Proveedor(String nombre,String razonSocial, String domicilio, String telefono, boolean estado) {
        this.nombre=nombre;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.estado=true;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idProvedor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (this.idProvedor != other.idProvedor) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        //return "• "   + idProvedor + " " + nombre + " , " + razonSocial + ", " + domicilio + " - " + telefono  ;
        return nombre + " / " + razonSocial;
    }

}
