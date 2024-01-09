package com.ilagunilla.ad02;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DOMXML1 {
    
public static void main(String[] args) {
    
    try {

        File inputFile = new File("clase.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("EMPLEADOS");
        System.out.println("----------------------------");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            /*if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("numero de alumno : "+ eElement.getAttribute(name));
                System.out.println("nombre : "+ eElement.getElementsByTagName(name));
                System.out.println("apellido :"+ eElement.getElementsByTagName);
                System.out.println("apodo : "+ eElement.getElementsByTagName);
                System.out.println("marcas : "+eElement.getElementsByTagName);
            }*/
        }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
}