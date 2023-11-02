
package entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor provedor;
    private DetalleCompra detalleCompra;
    private LocalDate fecha;
    private boolean estado;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor provedor,DetalleCompra detalleCompra, LocalDate fecha, boolean estado) {
        this.idCompra = idCompra;
        this.provedor = provedor;
        this.detalleCompra=detalleCompra;
        this.fecha = fecha;
        this.estado=true;
    }

    public Compra(Proveedor provedor,DetalleCompra detalleCompra, LocalDate fecha, boolean estado) {
        this.provedor = provedor;
        this.detalleCompra=detalleCompra;
        this.fecha = fecha;
        this.estado=true;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Proveedor provedor) {
        this.provedor = provedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public DetalleCompra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", provedor=" + provedor + ", fecha=" + fecha + '}';
    }

}
