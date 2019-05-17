
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
        try {
            JAXBContext context = JAXBContext.newInstance(Tienda.class);
            Unmarshaller u = context.createUnmarshaller();
            Object objetoXml = u.unmarshal(new File("src/tienda.xml"));
            Tienda tienda = (Tienda) objetoXml;

            for (int i = 0; i < tienda.getClientes().size(); i++) {
                System.out.println("ID: " + tienda.getClientes().get(i).getId());
                System.out.println("Nombre: " + tienda.getClientes().get(i).getNombre());
            }
            System.out.println("--------------------------------------------------------");
            for (int i = 0; i < tienda.getClientes().size(); i++) {
                for (int j = 0; j < tienda.getClientes().get(i).getPedidos().size(); j++) {
                    String dateStr = tienda.getClientes().get(i).getPedidos().get(j).getFecha();
                    String date = tienda.getClientes().get(0).getPedidos().get(0).getFecha();
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date date1 = df.parse(date);
                    Date date2 = df.parse(dateStr);

                    if (date1.compareTo(date2) > 0) {
                        System.out.println(tienda.getClientes().get(i).getNombre());
                        System.out.println(tienda.getClientes().get(i).getPedidos().get(j).getFecha());
                    }
                }
            }
            System.out.println("--------------------------------------------------------");
            for (int i = 0; i < tienda.getClientes().size(); i++) {
                for (int j = 0; j < tienda.getClientes().get(i).getPedidos().size(); j++) {
                    int importe1 = tienda.getClientes().get(i).getPedidos().get(j).getImporte();
                    int importe = tienda.getClientes().get(0).getPedidos().get(0).getImporte();

                    if (importe > importe1) {
                        if (j < tienda.getClientes().size()-1) {
                            System.out.println(tienda.getClientes().get(i).getNombre());
                            System.out.println(tienda.getClientes().get(i).getPedidos().get(j).getFecha());
                            System.out.println(tienda.getClientes().get(i).getPedidos().get(j).getImporte());
                        }
                    }
                }
            }

        } catch (JAXBException | ParseException e) {
            e.printStackTrace();
        }
    }
}
