
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainTienda {
    public static void main(String[] args) {
        Cliente cliente = null;
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        int indiceFechaMayor = 0;
        int indiceImporteMayor = 0;
        try {
            JAXBContext context = JAXBContext.newInstance(Tienda.class);
            Unmarshaller u = context.createUnmarshaller();
            Object objetoXml = u.unmarshal(new File("src/tienda.xml"));
            Tienda tienda = (Tienda) objetoXml;

            extraerClientes(tienda);
            System.out.println("------------------------------------------------------------------");
            extraerFechaMenor(cliente, df, indiceFechaMayor, tienda);

            System.out.println("------------------------------------------------------------------");


            extraerImporteMayor(indiceImporteMayor, tienda);

            System.out.println("------------------------------------------------------------------");

            ordernarPorFecha(df, tienda);

        } catch (JAXBException | ParseException e) {

            e.printStackTrace();
        }
    }

    private static void ordernarPorFecha(DateFormat df, Tienda tienda) throws ParseException {
        Date date;
        Cliente[] clientes = new Cliente[tienda.getClientes().size()];
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            clientes[i] = tienda.getClientes().get(i);
        }

        date = df.parse(clientes[0].getPedidos().get(0).getFecha());
        for (int i = 0; i < clientes.length; i++) {
            for (int j = 0; j < clientes.length; j++) {
                if (date.compareTo(df.parse(clientes[i].getPedidos().get(j).getFecha())) > 0) {
                    Cliente temp = clientes[i];
                    clientes[i] = clientes[j];
                    clientes[j] = temp;
                }
            }
        }
        for (Cliente cliente2 : clientes) {
            for (int j = 0; j < cliente2.getPedidos().size(); j++) {
                System.out.println(cliente2.getPedidos().get(j).getFecha());
                System.out.println(cliente2.getId());
                System.out.println(cliente2.getNombre());
                System.out.println(cliente2.getPedidos().get(j).getImporte());
                System.out.println("---------------------------");
            }

        }
    }

    private static void extraerFechaMenor(Cliente cliente, DateFormat df, int indiceFechaMayor, Tienda tienda) throws ParseException {
        Date date;
        date = df.parse(tienda.getClientes().get(0).getPedidos().get(0).getFecha());
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            for (int j = 0; j < tienda.getClientes().get(i).getPedidos().size(); j++) {
                if (df.parse(tienda.getClientes().get(i).getPedidos().get(j).getFecha()).compareTo(date) < 0) {
                    cliente = tienda.getClientes().get(i);
                    indiceFechaMayor = j;
                    date = df.parse(tienda.getClientes().get(i).getPedidos().get(j).getFecha());
                }
            }
        }

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getPedidos().get(indiceFechaMayor).getFecha());
        System.out.println(cliente.getPedidos().get(indiceFechaMayor).getImporte());
    }

    private static void extraerClientes(Tienda tienda) {
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            System.out.println("ID: " + tienda.getClientes().get(i).getId());
            System.out.println("Nombre: " + tienda.getClientes().get(i).getNombre());
        }
    }

    private static void extraerImporteMayor(int indiceImporteMayor, Tienda tienda) {
        Cliente cliente;
        int importeMayor;
        cliente = tienda.getClientes().get(0);
        importeMayor = tienda.getClientes().get(0).getPedidos().get(0).getImporte();
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            for (int j = 0; j < tienda.getClientes().get(i).getPedidos().size(); j++) {
                if (tienda.getClientes().get(i).getPedidos().get(j).getImporte() > importeMayor) {
                    cliente = tienda.getClientes().get(i);
                    importeMayor = tienda.getClientes().get(i).getPedidos().get(j).getImporte();
                    indiceImporteMayor = j;
                }
            }
        }

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getPedidos().get(indiceImporteMayor).getFecha());
        System.out.println(importeMayor);
    }
}
