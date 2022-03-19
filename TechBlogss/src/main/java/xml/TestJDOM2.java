package xml;

//JDOM parser

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class TestJDOM2 {
  public static void main(String[] args) {
     
      SAXBuilder builder = new SAXBuilder();
      File xmlFile = new File("c:\\employees.xml");  
      
      try {

          Document document = (Document) builder.build(xmlFile);
          Element rootNode = document.getRootElement();
          System.out.println("Root: " + rootNode.getName());
          
          List<Element> list = rootNode.getChildren("employee");
      
          for (int i = 0; i < list.size(); i++) {
              Element node = (Element) list.get(i);
              System.out.println("id : " + node.getAttributeValue("id"));
              System.out.println("First Name : " + node.getChildText("firstname"));
              System.out.println("Last Name : " + node.getChildText("lastname"));
          }
          
      } catch (IOException  e) {
       e.printStackTrace();
      } catch (JDOMException  e) {
       e.printStackTrace();
      } 
  }
}