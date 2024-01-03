package com.ilagunilla.ad02;

/**
 *
 * @author ismal
 */
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXXML {

    public static void main(String[] args) {
        try {
            // Crear el SAXParser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // Crear un manejador SAX
            DefaultHandler handler = new DefaultHandler() {
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes)
                        throws SAXException {
                    System.out.println("Etiqueta: " + qName);
                }
            };

            // Parsear el archivo XML utilizando SAX
            saxParser.parse(new File("EMPLEADOS.XML"), handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

