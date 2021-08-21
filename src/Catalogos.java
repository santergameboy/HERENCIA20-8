import java.util.Date;

public class Catalogos extends Proveedores {
    private String modelos;
    private int precios;
    private int codigo;
     private int memoria;
     private int velocidad;
    private String definicion;
    public Catalogos(int cantidad,String productos,String modelos,int precios,int codigo,int memoria,int velocidad,String definicion){
        super(cantidad,productos );
        this.setModelos(modelos);
        this.setPrecios(precios);
        this.setCodigo(codigo);
        this.setMemoria(memoria);
        this.setVelocidad(velocidad);
        this.setDefinicion(definicion);
        this.setCantidad(cantidad);
        this.setProductos(productos);
    }

    public Catalogos(String nombre, String direccion, int telefono, Date fechacompra, int preciototal, int cantidad, String productos, int codigo) {
        super(nombre,direccion,telefono,fechacompra,preciototal,cantidad,productos,codigo);
    }

    public Catalogos(Date fechasoporte, String motivo, String nombre, Date fechacompra, String productos, int codigo) {
        super(fechasoporte,motivo,nombre,fechacompra,productos,codigo);
    }


    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return "Catalogos " +
                " Modelos='" + modelos + '\'' +
                ", Precios=" + precios +
                ", Codigo=" + codigo +
                ", Memoria=" + memoria +
                ", Velocidad=" + velocidad +
                ", Definicion='" + definicion + '\'' +
                ", Cantidad=" + cantidad +
                ", Productos='" + productos + '\'' ;
    }
}
