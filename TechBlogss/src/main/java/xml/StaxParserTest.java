package xml;



//Parses XML using StAX Parser    
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StaxParserTest {
 public static void main(String[] args) {
   
   try {
	   XMLOutputFactory factory = XMLOutputFactory.newInstance();
      XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("C://employees.xml"));

      writer.writeStartDocument();
      writer.writeStartElement("employees");
      
      writer.writeStartElement("employee");

      writer.writeAttribute("id", "123");
      writer.writeStartElement("firstname");
      writer.writeCharacters("Peter");
      writer.writeEndElement();
      
      writer.writeStartElement("lastname");
      writer.writeCharacters("Parker");
      writer.writeEndElement();
      writer.writeEndElement();
      
      writer.writeStartElement("employee");

      writer.writeAttribute("id", "124");
      writer.writeStartElement("firstname");
      writer.writeCharacters("Harry");
      writer.writeEndElement();
      
      writer.writeStartElement("lastname");
      writer.writeCharacters("Potter");
      writer.writeEndElement();

      writer.writeEndElement();
      writer.writeEndDocument();

      writer.flush();
      writer.close();

   } catch (IOException | XMLStreamException e) {
      e.printStackTrace();
   } 
 }
}
	

