
package entidades;


public class DetalleCompra {
  private int idDetalle;
  private int cantidad;
  private double precioCosto;
  private Compra compra;
  private Producto producto;
  private boolean estado;

    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, Compra compra,Producto producto,boolean estado) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra=compra;
        this.producto = producto;
        this.estado=true;
    }

    public DetalleCompra(int cantidad, double precioCosto, Compra compra, Producto producto,boolean estado) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra=compra;
        this.producto = producto;
        this.estado=true;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Producto: "+producto.getNombreProducto()+ " Descripcion: "+producto.getDescripcion()+" Cantidad: "+" "+cantidad+" Costo: "+precioCosto+"$";
        //return "DetalleCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", compra=" + compra + ", producto=" + producto + ", estado=" + estado + '}';
    }

    
    
    
    
  
}
