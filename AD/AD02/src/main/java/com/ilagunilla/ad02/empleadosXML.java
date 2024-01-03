package com.ilagunilla.ad02;

/**
 *
 * @author ismal
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.RandomAccessFile;

public class empleadosXML {

    public static void main(String[] args) {
        // Nombre del archivo binario de empleados
        String nombreFicheroBinario = "EMPLEADOS.DAT";

        // Nombre del archivo XML de empleados
        String nombreFicheroXML = "EMPLEADOS.XML";

        // Convertir datos del fichero binario a XML
        convertirBinarioAXML(nombreFicheroBinario, nombreFicheroXML);
    }

    private static void convertirBinarioAXML(String nombreFicheroBinario, String nombreFicheroXML) {
        try {
            // Crear el documento XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            // Elemento raíz del documento XML
            Element rootElement = document.createElement("empleados");
            document.appendChild(rootElement);

            // Abrir el fichero binario en modo lectura
            RandomAccessFile fichero = new RandomAccessFile(nombreFicheroBinario, "r");

            while (fichero.getFilePointer() < fichero.length()) {
                // Crear un elemento para cada empleado
                Element empleadoElement = document.createElement("empleado");

                // Leer cada campo del empleado del fichero
                int codigo = fichero.readInt();
                String nombre = leerCadena(fichero, 20);
                String direccion = leerCadena(fichero, 30);
                float salario = fichero.readFloat();
                float comision = fichero.readFloat();

                // Añadir los campos como elementos al elemento empleado
                agregarElemento(document, empleadoElement, "codigo", String.valueOf(codigo));
                agregarElemento(document, empleadoElement, "nombre", nombre);
                agregarElemento(document, empleadoElement, "direccion", direccion);
                agregarElemento(document, empleadoElement, "salario", String.valueOf(salario));
                agregarElemento(document, empleadoElement, "comision", String.valueOf(comision));

                // Añadir el elemento empleado al elemento raíz
                rootElement.appendChild(empleadoElement);
            }

            // Cerrar el fichero binario
            fichero.close();

            // Escribir el contenido del documento XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(nombreFicheroXML);
            transformer.transform(source, result);

            System.out.println("Archivo XML generado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para agregar un elemento al documento XML
    private static void agregarElemento(Document document, Element padre, String nombreElemento, String valor) {
        Element elemento = document.createElement(nombreElemento);
        elemento.appendChild(document.createTextNode(valor));
        padre.appendChild(elemento);
    }

    // Método para leer una cadena del fichero con un tamaño específico
    private static String leerCadena(RandomAccessFile fichero, int tamano) throws Exception {
        // Leer la cadena del fichero
        byte[] bytes = new byte[tamano * 2]; // Cada carácter en Java utiliza 2 bytes (UTF-16)
        fichero.readFully(bytes);
        return new String(bytes, "UTF-16").trim();
    }
}
