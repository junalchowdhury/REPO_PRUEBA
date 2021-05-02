public class Venta {
    private Producto[] productos;
    private float totalVenta;

    public Producto[] getProductos() {
        return productos;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }
}
