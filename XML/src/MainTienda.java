
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


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

                for(int j=0;j<tienda.getClientes().get(i).getPedidos().size();j++){
                    System.out.println("Fecha: " + tienda.getClientes().get(j).getPedidos().get(i).getFecha());
                }
            }
/*
            for (int j = 0; j < tienda.getClientes().size(); j++) {

                if(importemayor<tienda.getClientes().get(j).getPedidos().get(j).getImporte()){
                    importemayor=tienda.getClientes().get(j).getPedidos().get(j).getImporte();
                }

            }
            System.out.println(importemayor);
*/
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
