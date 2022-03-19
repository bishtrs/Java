package xml;

//Parses XML using DOM4J Parser        
import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class TestDOM4J {
 public static void main(String[] args) {
     try {
         File inputFile = new File("C://employees.xml");
         SAXReader reader = new SAXReader();
         Document document = reader.read( inputFile );
         System.out.println("Root element:" + document.getRootElement().getName());

         List<Node> nodes = document.selectNodes("/employees/employee" );
      
         for (Node node : nodes) {
             System.out.println("\nCurrent Element :" + node.getName());
             System.out.println("Employee id : "+ node.valueOf("@id") );
             System.out.println("First Name : " 
                 + node.selectSingleNode("firstname").getText());
             System.out.println("Last Name : "  
                 + node.selectSingleNode("lastname").getText());
      }
     } catch (DocumentException e) {
         e.printStackTrace();
     }
 }
}
