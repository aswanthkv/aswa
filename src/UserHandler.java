package onemonth;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by expert on 8/9/18.
 */
public class UserHandler extends DefaultHandler{

    boolean name=false;
    boolean price=false;
    boolean description=false;
    boolean calories=false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(qName);
       if(qName.equalsIgnoreCase("food")){
           String label=attributes.getValue("label");
           System.out.println("label "+label);
       }
       else if(qName.equalsIgnoreCase("name"))
       {
           name=true;
       }
       else if(qName.equalsIgnoreCase("price"))
       {
           price=true;
       }
       else if(qName.equalsIgnoreCase("description"))
       {
           description=true;
       }
       else if(qName.equalsIgnoreCase("calories"))
       {
           calories=true;
       }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("food")){
            System.out.println("End element: "+qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (name){
            String s=new String(ch,start,length);
            System.out.println("name:"+s);
            name=false;
        }
        else if (price){
            String s=new String(ch,start,length);
            System.out.println("price:"+s);
            price=false;
        }
        else if (description) {
            String s=new String(ch,start,length);
            System.out.println("description: "+s);
            description=false;
        }
        else if (calories) {
            String s=new String(ch,start,length);
            System.out.println("calories: "+s);
            calories=false;
        }
    }

    public static void main(String[] args) {
        try{
            File inputFile=new File("sample.txt");
            SAXParserFactory factory=SAXParserFactory.newInstance();
            SAXParser saxParser=factory.newSAXParser();
            UserHandler handler=new UserHandler();
            saxParser.parse(inputFile,handler);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }

    }

}
