import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class DOMExample
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("D:\\GitHub\\JAVA\\java_Full_Stack\\Practical_six_sem\\WT\\XML\\demo.xml");

            DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();

            DocumentBuilder builder =
            factory.newDocumentBuilder();

            Document doc = builder.parse(file);

            NodeList list =
            doc.getElementsByTagName("name");

            Node node = list.item(0);

            System.out.println(node.getTextContent());
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}