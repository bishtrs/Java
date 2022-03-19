package xml;

//Parses XML file using Java DOM parser and prints attribute values
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//Parses XML file using Java DOM parser and prints attribute values

				
public class DOMXMLParserReadAttributes {
 public static void main(String[] args) {
     try {
         File inputFile = new File("C://employees.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = null;
         try {
             dBuilder = dbFactory.newDocumentBuilder();
         } catch (ParserConfigurationException e) {
             e.printStackTrace();
         }
			
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         NodeList nodeList = doc.getElementsByTagName("employee");
             
         for (int i = 0; i < nodeList.getLength(); i++) {
             Node node = nodeList.item(i);
             System.out.println("Current Element :" + node.getNodeName());
             
             if (node.getNodeType() == Node.ELEMENT_NODE) {
                 NamedNodeMap nodeMap = node.getAttributes();
             
             for (int j = 0; j < nodeMap.getLength(); j++) {
                 	Node node2 = nodeMap.item(j);
                 	System.out.println("attribute name : " + node2.getNodeName());
                 	System.out.println("attribute value  : " + node2.getNodeValue());
                 }
             }
         }
     } catch (Exception e) {
         e.printStackTrace();
     } 

 }
}