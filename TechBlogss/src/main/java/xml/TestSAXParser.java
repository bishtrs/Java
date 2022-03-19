package xml;

	// SAX Parser     
	import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

	// SAX event handler 
	class EmployeeHandler extends DefaultHandler {
	    boolean id = false;
	    boolean firstname = false;
	    boolean lastname = false;

	    @Override
	    public void startElement(String uri, String localName, String qName,
	        Attributes attributes) throws SAXException {
		
	        if (qName.equalsIgnoreCase("employee")) {
	            String id = attributes.getValue("id");
	            System.out.println("id  : " + id);
	        } else if (qName.equalsIgnoreCase("firstname")) {
	            firstname = true;
	        } else if (qName.equalsIgnoreCase("lastname")) {
	            lastname = true;
	        }
	    }
		
	    @Override
	    public void endElement(String uri, String localName, String qName)
	        throws SAXException {
	        if (qName.equalsIgnoreCase("student")) {
	            System.out.println("End Element :" + qName);
	        } 
	    }
			
	    @Override
	    public void characters(char ch[], int start, int length) throws SAXException {
	        if (firstname) {
	            System.out.println("First Name : " + new String(ch, start, length));
	            firstname = false;
	        }
			
	        if (lastname) {
	            System.out.println("Last Name : " + new String(ch, start, length));
	            lastname = false;
	        }
	    }
	}
		

	public class TestSAXParser {
	    public static void main(String[] args) {
	        try {
	            File inputFile = new File("C://employees.xml");
	            SAXParserFactory  saxParserFactory = SAXParserFactory .newInstance();
	            SAXParser saxParser = saxParserFactory.newSAXParser();
	            EmployeeHandler handler = new EmployeeHandler() ;
	    	    saxParser.parse(inputFile, handler); 
	        } catch (Exception  e) {
	            e.printStackTrace();
	        }  
	    }
	}
