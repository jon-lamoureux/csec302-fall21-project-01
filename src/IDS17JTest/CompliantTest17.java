package IDS17JTest;
import IDS17J.NonCompliant17;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS17J.Compliant17;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;

public class CompliantTest17 {
    private Compliant17 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant17();
    }

    @Test
    public void test() throws IOException, ParserConfigurationException, SAXException {
        Compliant17.receiveXMLStream(new FileInputStream("src/IDS17J/evil.xml"), new DefaultHandler());
    }
}
