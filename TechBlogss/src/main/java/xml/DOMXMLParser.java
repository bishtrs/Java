package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
				
public class DOMXMLParser {
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
                    Element element = (Element) node;
                
                    System.out.println("Employee id: "  
                        + element.getAttribute("id"));
                    System.out.println("First Name : "
                        + element.getElementsByTagName("firstname")
                        .item(0).getTextContent());
                    System.out.println("Last Name : "
                        + element.getElementsByTagName("lastname")
                        .item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}