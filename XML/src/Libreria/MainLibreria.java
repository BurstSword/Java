package Libreria;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainLibreria {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Libreria.class);
            Unmarshaller u = context.createUnmarshaller();
            Object objetoXml = u.unmarshal(new File("src/libreria.xml"));
            Libreria libreria = (Libreria) objetoXml;

            for(int i=0;i<libreria.getLibros().size();i++){
                System.out.println("Libreria: "+libreria.getLibros().get(i).getTitulo());
                System.out.println("Autor: "+libreria.getLibros().get(i).getAutor());
                System.out.println("ISBN: "+libreria.getLibros().get(i).getIsbn());
                System.out.println();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
