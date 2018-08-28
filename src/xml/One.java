//package xml;
//
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import javax.swing.text.Document;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.File;
//import java.io.IOException;
//
//public class One {
//
//    public static void main(String[] args)
//    {
//        try{
//            File inputfile=new File("Sample.txt");
//            DocumentBuilderFactory dbfactory=DocumentBuilderFactory.newInstance();
//            DocumentBuilder dbuilder=dbfactory.newDocumentBuilder();
//            org.w3c.dom.Document doc=dbuilder.parse(inputfile);
//
//            NodeList nlist=doc.getElementsByTagName("food");
//
//            for(int temp=0;temp<nlist.getLength();temp++)
//            {
//                Node nNode=nlist.item(temp);
//                System.out.println("\nCurrent element:"+nNode.getN);
//            }
//
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
//
//
