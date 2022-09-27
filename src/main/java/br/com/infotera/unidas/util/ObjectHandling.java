package br.com.infotera.unidas.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import org.springframework.stereotype.Component;

/**
 * Class that has auxiliary methods for serialization and deserialization of objects and String handling
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class ObjectHandling {
    
    /**
     *
     * @param saida
     * @param caminho
     * @param nomeFile
     */
    public static void generateFile(String saida, String caminho, String nomeFile) {
        File diretorio = new File(caminho);
        File arqSaida = new File(diretorio, nomeFile);

        try {
            boolean statusArq = arqSaida.createNewFile();
            System.out.print(statusArq);

            FileWriter writer = new FileWriter(arqSaida, false);
            PrintWriter printer = new PrintWriter(writer);
            printer.println(saida);

            printer.flush();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String marshalObjectXML(Object object) {
        final StringWriter out = new StringWriter();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(
                    javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE
            );
            marshaller.marshal(object, new StreamResult(out));
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        String saida = treatString(out.toString());
        
        return saida;
    }
    
    public static Object marshalXMLToObject(String xml, Class clazz) {
        xml = treatString(xml);
        Object result = null;
        JAXBContext context = null;

        if (xml != null && !xml.equals("")) {
            try {
                context = JAXBContext.newInstance(clazz);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                result = JAXBIntrospector.getValue(unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes())));
            } catch (JAXBException ex) {
                System.err.println(ex.getCause().getMessage());
            }
            
        }
        return result;
    }
    
    public static String treatString(String saida){
        String replace1 = saida.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
        String replace2 = replace1.replace("<?xml version=\"1.0\" encoding=\"iso-8859-1\" ?>", "");
        String replace3 = replace2.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
        String replace = replace3;
        
        return replace;
    }
       
}
