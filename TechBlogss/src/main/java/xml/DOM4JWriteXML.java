package xml;

//Parses XML using DOM4J Parser        
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DOM4JWriteXML {
	public static void main(String[] args) {
		try {
			Document document = DocumentHelper.createDocument();
			Element root = document.addElement("actors");
			
			Element actorElement1 = root.addElement("actor").addAttribute("type", "Action");
			actorElement1.addElement("firstname").setText("Sylvester");
			actorElement1.addElement("lastname").setText("Stallone");
			
			Element actorElement2 = root.addElement("actor").addAttribute("type", "Comedian");
			actorElement2.addElement("firstname").setText("Adam");
			actorElement2.addElement("lastname").setText("Sandler");

			Element actorElement3 = root.addElement("actor").addAttribute("type", "Romantic");
			actorElement3.addElement("firstname").setText("Huge");
			actorElement3.addElement("lastname").setText("Grant");

			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(new FileWriter( new File("C://actors.xml")), format);
			writer.write(document);
			writer.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
