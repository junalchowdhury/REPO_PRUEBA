import java.util.ArrayList;

public class Ejecuta {
    public static void main(String[] args) {

        // estoy considerando que en cada venta hay 3 producto
        Venta v1 = new Venta();
        Producto p1 = new Producto("prodcuto1","P01", 1.5f);
        Producto p2 = new Producto("prodcuto2","P02", 2.0f);
        Producto[] lstProd = new Producto[2];
        lstProd[0] = p1;
        lstProd[1] = p2;
        v1.setProductos(lstProd);
        v1.setTotalVenta(p1.getMontoUnitario()+p2.getMontoUnitario());

        Venta v2 = new Venta();
        Producto p3 = new Producto("prodcuto3","P01", 4.5f);
        Producto p4 = new Producto("prodcuto4","P02", 1.0f);
        Producto[] lstProd2 = new Producto[2];
        lstProd2[0] = p3;
        lstProd2[1] = p4;
        v2.setProductos(lstProd);
        v2.setTotalVenta(p3.getMontoUnitario()+p4.getMontoUnitario());

        Venta[] ventas = new Venta[2];
        ventas[0] = v1;
        ventas[1] = v2;

        System.out.println(ventas);
        System.out.println(ventas[0]);
        System.out.println(ventas[1]);
    }

}
