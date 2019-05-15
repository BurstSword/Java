import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "tienda")
public class Tienda {
    private ArrayList<Cliente> clientes;

    public Tienda(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Tienda(){
        this.clientes=new ArrayList<>();
    }

    @XmlElementWrapper(name = "clientes")
    @XmlElement(name = "cliente")
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
