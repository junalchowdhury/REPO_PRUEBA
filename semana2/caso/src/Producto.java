public class Producto {
    private String nombre;
    private String codigo;
    private Float montoUnitario;

    public Producto() {
    }

    public Producto(String nombre, String codigo, Float montoUnitario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.montoUnitario = montoUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getMontoUnitario() {
        return montoUnitario;
    }

    public void setMontoUnitario(Float montoUnitario) {
        this.montoUnitario = montoUnitario;
    }
}
