package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
				
public class WriteXMLDOMParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
                
            Element rootElement = doc.createElementNS("", "employees");
            doc.appendChild(rootElement);
                
            rootElement.appendChild(createElement(doc, "123", "hr", "Mohit", "Bisht"));
            rootElement.appendChild(createElement(doc, "456", "finance", "Samit", "Ahlawat"));
                
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
                
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
                
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("E:\\employees.xml"));
                
            transformer.transform(source, console);
            transformer.transform(source, file);
                
        } catch (Exception e) {
                e.printStackTrace();
            } 

        }
        
    private static Element createElement(Document doc, String id, String department,
            String firstname, String lastname) {
        
        Element employee = doc.createElement("employee");
        employee.setAttribute("id", id);
        employee.setAttribute("department", department);
                
        Element node1 = doc.createElement("firstname");
        node1.appendChild(doc.createTextNode(firstname));
                
        employee.appendChild(node1);
               
        Element node2 = doc.createElement("lastname");
        node2.appendChild(doc.createTextNode(lastname));
                
        employee.appendChild(node2);
            
        return employee;
    }
}
