import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import org.w3c.dom.*;

/**
 * Created by dell on 8/8/18.
 */
public class DocParser {

    public static void main(String[] args) {
        try {

            File inputfile=new File("sample.txt");
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc=dBuilder.parse(inputfile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element : "+ doc.getDocumentElement().getNodeName());

            NodeList nList=doc.getElementsByTagName("food");
            System.out.println("-------------------------");

            for (int tmp=0; tmp<nList.getLength();tmp++)
            {
                Node nNode=nList.item(tmp);
                System.out.println("\nCurrent Element :"+nNode.getNodeName());
                if (nNode.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element eElement=(Element) nNode;
                    System.out.println("food Label : "+eElement.getAttribute("label"));
                    System.out.println("First Name"+eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Price : "+eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("Description : "+eElement.getElementsByTagName("description").item(0).getTextContent());
                    System.out.println("Calories : "+eElement.getElementsByTagName("calories").item(0).getTextContent());
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }

}
