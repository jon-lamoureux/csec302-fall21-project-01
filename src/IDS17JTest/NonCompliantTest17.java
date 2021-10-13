package IDS17JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS17J.NonCompliant17;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NonCompliantTest17 {
    @Test
    public void test() throws IOException, ParserConfigurationException, SAXException {
        NonCompliant17.receiveXMLStream(new FileInputStream("evil.xml"), new DefaultHandler());
    }

}
