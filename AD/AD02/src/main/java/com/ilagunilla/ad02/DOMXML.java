package com.ilagunilla.ad02;

/**
 *
 * @author ismal
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMXML {

    public static void main(String[] args) {
        try {
            // Crear el DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML
            Document document = builder.parse(new File("EMPLEADOS.XML"));

            // Visualizar etiquetas utilizando DOM
            visualizarEtiquetasDOM(document.getDocumentElement());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void visualizarEtiquetasDOM(Node nodo) {
        // Verificar si el nodo es un elemento
        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println("Etiqueta: " + nodo.getNodeName());

            // Obtener la lista de nodos hijos
            NodeList hijos = nodo.getChildNodes();

            // Recorrer los nodos hijos de forma recursiva
            for (int i = 0; i < hijos.getLength(); i++) {
                visualizarEtiquetasDOM(hijos.item(i));
            }
        }
    }
}

