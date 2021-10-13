package IDS17J;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NonCompliant17 {
    public String resolveEntity(String publicId, String file) {

        System.out.println("Resolving entity: " + publicId + " " + file);
        return file;

    }
}

