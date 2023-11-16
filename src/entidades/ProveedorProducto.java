
package entidades;


public class ProveedorProducto {
    private int idProveedorProducto;
    private Proveedor proveedror;
    private Producto producto;
    private boolean estado;

    public ProveedorProducto() {
    }

    public ProveedorProducto(int idProveedorProducto, Proveedor proveedror, Producto producto) {
        this.idProveedorProducto = idProveedorProducto;
        this.proveedror = proveedror;
        this.producto = producto;
        this.estado=true;
    }

    public ProveedorProducto(Proveedor proveedror, Producto producto) {
        this.proveedror = proveedror;
        this.producto = producto;
        this.estado=true;
    }

    public int getIdProveedorProducto() {
        return idProveedorProducto;
    }

    public void setIdProveedorProducto(int idProveedorProducto) {
        this.idProveedorProducto = idProveedorProducto;
    }

    public Proveedor getProveedror() {
        return proveedror;
    }

    public void setProveedror(Proveedor proveedror) {
        this.proveedror = proveedror;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        return "ProveedorProducto{" + "idProveedorProducto=" + idProveedorProducto + ", proveedror=" + proveedror + ", producto=" + producto + '}';
    }

    

    
    
    
    
}
