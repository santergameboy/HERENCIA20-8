import java.util.Date;

public class Soporte extends Cliente {
    private Date fechasoporte;
    private String motivo;

    public Soporte(String nombre,Date fechacompra,Date fechasoporte,String motivo,String productos , int codigo){
        super(fechasoporte,motivo,nombre,fechacompra,productos,codigo);
        this.setFechasoporte(fechasoporte);
        this.setMotivo(motivo);
        this.setNombre(nombre);
        this.setFechacompra(fechacompra);
        this.setProductos(productos);
        this.setCodigo(codigo);


    }

    public Date getFechasoporte() {
        return fechasoporte;
    }

    public void setFechasoporte(Date fechasoporte) {
        this.fechasoporte = fechasoporte;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Soporte " +
                "  Nombre='" + nombre + '\'' +
                ", Soporte= " + productos +
                ", FechaCompra='" + fechacompra + '\'' +
                ", FechaSoporte=" + fechasoporte +
                ", Motivo='" + motivo + '\'' +
                ", Producto= "+productos+'\''+
                ", Codigo= "+getCodigo();
    }
}
