package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Userhandler extends DefaultHandler {
    boolean name=false;
    boolean price=false;
    boolean description=false;
    boolean calories=false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //super.startElement(uri, localName, qName, attributes);
        System.out.println(qName);
        if(qName.equalsIgnoreCase("food"))
        {
            String label=attributes.getValue("label");
            System.out.println("label: "+label);
        }
        else if (qName.equalsIgnoreCase("name"))
        {
            name=true;
        }
        else if(qName.equalsIgnoreCase("price"))
        {
            price=true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //super.endElement(uri, localName, qName);
        if(qName.equalsIgnoreCase("food"))
        {
            System.out.println("end element "+qName);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //super.characters(ch, start, length);
        if(name)
        {
            String s=new String(ch,start,length);
            System.out.println("name:"+s);
            name=false;

        }
        else if(price)
        {
            String k=new String(ch,start,length);
            System.out.println("price:"+k);
            price=false;
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, FileNotFoundException {
        File inputfile=new File("sample.txt");
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();
        Userhandler handler=new Userhandler(); //its the event handler;
        parser.parse(inputfile,handler);//parse fuction is used to start parsing;

    }

}
