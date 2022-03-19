package xml;

//JDOM2 parser
import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JDOM2FileWriter {
  public static void main(String[] args) {
     
      try {
          Element employees = new Element("employees");
          Document doc = new Document(employees);

          Element employee = new Element("employee");
          employee.setAttribute(new Attribute("id", "1"));
          employee.addContent(new Element("firstname").setText("Mark"));
          employee.addContent(new Element("lastname").setText("Carter"));

          doc.getRootElement().addContent(employee);

          Element employee2 = new Element("employee");
          employee2.setAttribute(new Attribute("id", "2"));
          employee2.addContent(new Element("firstname").setText("James"));
          employee2.addContent(new Element("lastname").setText("Joseph"));
		
          doc.getRootElement().addContent(employee2);
		
          Element employee3 = new Element("employee");
          employee3.setAttribute(new Attribute("id", "3"));
          employee3.addContent(new Element("firstname").setText("John"));
          employee3.addContent(new Element("lastname").setText("Hogg"));

          doc.getRootElement().addContent(employee3);

          XMLOutputter xmlOutput = new XMLOutputter();

          xmlOutput.setFormat(Format.getPrettyFormat());
          xmlOutput.output(doc, new FileWriter("c:\\employees.xml"));
          
      } catch (IOException  e) {
          e.printStackTrace();
      } 
  }
}
	