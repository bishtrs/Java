package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
				
public class ModifyXMLDOMParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("E:\\employees.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
                
            NodeList nodeList = doc.getElementsByTagName("employee");
            int index = 0;
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    NamedNodeMap nodeMap = node.getAttributes();
                
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node2 = nodeMap.item(j);
                        if (node2.getNodeName().equalsIgnoreCase("id")) { 
                            if (node2.getNodeValue().equalsIgnoreCase("123")) {
                            	index = i;
                            }
                            if (node2.getNodeValue().equalsIgnoreCase("456")) {
                            	node2.setNodeValue("789");
                            }
                        }
                    }
                }
            }
                
            Node node = nodeList.item(index);
            doc.getElementsByTagName("employees").item(0).removeChild(node);
                
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("E:\\employees.xml"));
            transformer.transform(source, result);
                
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
      
}