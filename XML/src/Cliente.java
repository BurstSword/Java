import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "cliente")
@XmlType(propOrder = {"id", "nombre", "pedidos"})
public class Cliente {
    private int id;
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(int id, String nombre, ArrayList<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    public Cliente() {
        this.id = 0;
        this.nombre = "";
        this.pedidos = new ArrayList<>();
    }
    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @XmlAttribute(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElementWrapper(name = "pedidos")
    @XmlElement(name = "pedido")
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
