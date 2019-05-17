import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "pedido")
@XmlType(propOrder = {"id", "fecha", "importe"})
public class Pedido {
    private int id;
    private String fecha;
    private int importe;

    public Pedido(int id, String fecha, int importe) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
    }

    public Pedido() {
        this.id = 0;
        this.fecha = "";
        this.importe = 0;
    }

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "fecha")
    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @XmlElement(name = "importe")
    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
}
