package ut2_accesodatos;

import java.util.*;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.stream.*;
import javax.xml.parsers.*;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.stream.events.XMLEvent;

public class UT2_AccesoDatos {
      
 // Clase para empleado     
    
 public static class Empleado{
        
        public int CODIGO;
        public String NOMBRE;
        public String DIRECCION;
        public float SALARIO;
        public float COMISION; 
        
    public Empleado(int CODIGO, String NOMBRE, String DIRECCION, float SALARIO, float COMISION){
        this.CODIGO=CODIGO;  
        this.NOMBRE=NOMBRE;  
        this.DIRECCION=DIRECCION;  
        this.SALARIO=SALARIO;  
        this.COMISION=COMISION;  
        }
    }
 
 // Metodo para construir el XML 
 
 public static void generarXML (ArrayList codigoArray,ArrayList comisionArray,ArrayList direccionArray,ArrayList nombreArray,ArrayList salarioArray) throws Exception {
     
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       DOMImplementation implementation = builder.getDOMImplementation();
       Document XMLempleados = implementation.createDocument(null, "EMPLEADOS", null);
       XMLempleados.setXmlVersion("1.0");
 
       //Main Node
       Element raiz = XMLempleados.getDocumentElement();
       
       for(int i=0; i< codigoArray.size();i++){

            Element EmpleadoNode = XMLempleados.createElement("Empleado"); // Empleado Elemento

            // Codigo Elemento

            Element CodigoNode = XMLempleados.createElement("CODIGO"); 
            Text CodigoValue = XMLempleados.createTextNode(codigoArray.get(i).toString());
            CodigoNode.appendChild(CodigoValue);      

            // Comision Elemento

            Element ComisionNode = XMLempleados.createElement("COMISION"); 
            Text ComisionValue = XMLempleados.createTextNode(comisionArray.get(i).toString());
            ComisionNode.appendChild(ComisionValue);     

             // Direccion Elemento

            Element DireccionNode = XMLempleados.createElement("DIRECCION"); 
            Text DireccionValue = XMLempleados.createTextNode(direccionArray.get(i).toString());
            DireccionNode.appendChild(DireccionValue);     

             // Nombre Elemento

            Element NombreNode = XMLempleados.createElement("NOMBRE"); 
            Text NombreValue = XMLempleados.createTextNode(nombreArray.get(i).toString());
            NombreNode.appendChild(NombreValue);     

             // Salario Elemento

            Element SalarioNode = XMLempleados.createElement("SALARIO"); 
            Text SalarioValue = XMLempleados.createTextNode(salarioArray.get(i).toString());
            SalarioNode.appendChild(SalarioValue);     

            //append Elementos a Empleado
            EmpleadoNode.appendChild(CodigoNode);
            EmpleadoNode.appendChild(ComisionNode);
            EmpleadoNode.appendChild(DireccionNode);
            EmpleadoNode.appendChild(NombreNode);
            EmpleadoNode.appendChild(SalarioNode);

            //append EmpleadoNode a raiz
            raiz.appendChild(EmpleadoNode); 
                       
        }
       
        //Generate XML
       Source source = new DOMSource(XMLempleados);
        //Indicamos donde lo queremos almacenar
       Result result = new StreamResult(new java.io.File("EMPLEADOS.xml")); //nombre del archivo
       Transformer transformer = TransformerFactory.newInstance().newTransformer();
       transformer.transform(source, result);
       System.out.println("\nXML EMPLEADOS creado");
 }
 
 
    // Método para leer XML usando DOM // Cambio el fichero libros.xml de UTF-8 a ISO-8859-1 porque me daba problemas con caracteres latinos
 
     public static void leerXMLDOM (String Fichero) throws Exception {
         
        File inputFile = new File(Fichero);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("libro");
        System.out.println("\n----------- COMIENZO LEER DOM --------------");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nElemento: " + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
                System.out.println("Año : " + eElement.getAttribute("año"));
                
                for (int autNub = 0; autNub <  eElement.getElementsByTagName("autor").getLength(); autNub++) { // Puede haber más de 1 autor.
                    String autorApellido = eElement.getElementsByTagName("apellido").item(autNub).getTextContent();
                    String autorNombre = eElement.getElementsByTagName("nombre").item(autNub).getTextContent();
                    System.out.println("Autor : " + autorApellido + " , " + autorNombre);
                }
                
                System.out.println("Titulo : " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
                System.out.println("Editorial : " + eElement.getElementsByTagName("editorial").item(0).getTextContent());
                System.out.println("Precio : " + eElement.getElementsByTagName("precio").item(0).getTextContent());             
            }
         }
 
            System.out.println("\n------------ FIN LEER DOM --------------");
     }
     
        // Método para leer XML usando STAX
 
        public static void leerXMLSTAX (String Fichero) throws Exception {
            
            XMLInputFactory xmlif = XMLInputFactory.newInstance();
            XMLStreamReader xmlsr = xmlif.createXMLStreamReader(new FileInputStream(Fichero));
                      
            String tag = null;
            int eventType;
           
            String autorApellido = null;
            String autorNombre = null;
           
            System.out.println("\n------------ COMIENZO LEER STAX --------------");
            
            while (xmlsr.hasNext()) {

                eventType = xmlsr.next();

			switch (eventType) {

			case XMLEvent.START_ELEMENT:
                            
				tag = xmlsr.getLocalName();

				if (tag.equals("libro")) {
                                    System.out.println("\nElemento: libro");
                                    System.out.println("Año : " + xmlsr.getAttributeValue(0));
				}
                                
                                if (tag.equals("titulo")) {
                                    System.out.println("Título : " + xmlsr.getElementText());                                 
                                }
                                
                                if (tag.equals("apellido")) {
                                    autorApellido = xmlsr.getElementText();                                   
                                }
                                
                                if (tag.equals("nombre")) {
                                    autorNombre = xmlsr.getElementText();  
                                    System.out.println("Autor : " + autorApellido + " , " + autorNombre);
                                }                                                                              
                                                                
                                if (tag.equals("editorial")) {
                                    System.out.println("Editorial : " + xmlsr.getElementText());                                 
                                }
                                
                                if (tag.equals("precio")) {
                                    System.out.println("Precio : " + xmlsr.getElementText());                                 
                                }
				break;

			case XMLEvent.END_DOCUMENT:

                                System.out.println("\n------------ FIN LEER STAX --------------");

				break;

            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // EJERCICIO 1. Comienza crea un archivo DAT con los datos y crear el XML
        
        try {
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("EMPLEADOS.DAT"));

            Empleado empleado1 = new Empleado(1,"Juan","Madrid",1500,12);
            Empleado empleado2 = new Empleado(2,"María","Murcia",1700,9);
            Empleado empleado3 = new Empleado(3,"Amparo","Valencia",1600,7);
            Empleado empleado4 = new Empleado(4,"José","Barcelona",1560,8);
            Empleado empleado5 = new Empleado(5,"Alfonso","Sevilla",1670,10);

            archivo.writeObject(empleado1);
            archivo.writeObject(empleado2);
            archivo.writeObject(empleado3);
            archivo.writeObject(empleado4);
            archivo.writeObject(empleado5);

            archivo.close();
               
            FileInputStream filearchivo = new FileInputStream("EMPLEADOS.DAT");
            ObjectInputStream leerarchivo = new ObjectInputStream(filearchivo);
     
          // Creo ArrayLists para el XML
           
            ArrayList codigoArray = new ArrayList();
            ArrayList comisionArray = new ArrayList();
            ArrayList direccionArray = new ArrayList();
            ArrayList nombreArray = new ArrayList();
            ArrayList salarioArray = new ArrayList();
                     
          while( filearchivo.available() > 0){
           Empleado leer = (Empleado)leerarchivo.readObject();
              
            System.out.println("\nCodigo: " + leer.CODIGO); 
            System.out.println("Comision: " +leer.COMISION); 
            System.out.println("Direccion: " +leer.DIRECCION); 
            System.out.println("Nombre: " +leer.NOMBRE); 
            System.out.println("Salario: " +leer.SALARIO); 
        
            codigoArray.add(leer.CODIGO);
            comisionArray.add(leer.COMISION);
            direccionArray.add(leer.DIRECCION);
            nombreArray.add(leer.NOMBRE);
            salarioArray.add(leer.SALARIO);
         }
          
         //Genera XML
          
         try {        
            generarXML(codigoArray, comisionArray, direccionArray, nombreArray, salarioArray);
         } catch (Exception XMLe) {             
            System.out.println(XMLe);  
         }                       
       
        } catch (IOException IOe) {        
            System.out.println(IOe); 
         
        } catch (ClassNotFoundException ClassE) {            
            System.out.println(ClassE);        
        }
        
        // EJERCICIO 2. Comienza el lector de LIBRO DOM y STAX
        
        try {            
            leerXMLDOM("libros.xml"); // Lee en DOM            
        } catch (Exception LEERDOMe) {            
            System.out.println(LEERDOMe);                           
        }
        
        try {
            leerXMLSTAX("libros.xml"); // Lee en STAX
        } catch (Exception LEERSTAXe) {
           System.out.println(LEERSTAXe);            
        }
    }
}
