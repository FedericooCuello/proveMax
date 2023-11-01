
package entidades;


public class DetalleCompra {
  private int idDetalle;
  private int cantidad;
  private double precioCosto;
  private Producto producto;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.producto = producto;
    }

    public DetalleCompra(int cantidad, double precioCosto, Producto producto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.producto = producto;
    }
    
    

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    
    
    @Override
    public String toString() {
        return "datalleCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", producto=" + producto + '}';
    }
  
  
}
