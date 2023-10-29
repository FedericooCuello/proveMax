
package entidades;

public class Producto {
   private int idProducto;
   private String nombreProducto;
   private String descripcio;
   private double precioActual;
   private int stock;
   private boolean estado;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String descripcio, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcio = descripcio;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(String nombreProducto, String descripcio, double precioActual, int stock, boolean estado) {
        this.nombreProducto = nombreProducto;
        this.descripcio = descripcio;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcio=" + descripcio + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }
   
}
