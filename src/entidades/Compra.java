
package entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor provedor;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor provedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.provedor = provedor;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", provedor=" + provedor + ", fecha=" + fecha + '}';
    }

}
