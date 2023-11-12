
package entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;
    private boolean estado;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha, boolean estado) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado=true;
    }

    public Compra(Proveedor proveedor, LocalDate fecha, boolean estado) {
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estado=true;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProvedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor.getNombre()+ ", fecha=" + fecha + ", estado=" + estado + '}';
    }
    
    
    

}
