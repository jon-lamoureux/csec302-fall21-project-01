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

import static org.junit.Assert.assertEquals;

public class CompliantTest17 {

    Compliant17 object = new Compliant17();

    @Test
    public void GarbageInput(){
        String in = "43ny7n54ny9348cny99";
        String out = object.resolveEntity("123", in);
        assertEquals("",out);
    }

    @Test
    public void maliciousInput(){
        String in = "evil.xml";
        String out = object.resolveEntity("123", in);
        assertEquals("",out);
    }

    @Test
    public void whitelist1(){
        String in = "file:/Users/onlinestore/good.xml";
        String out = object.resolveEntity("123", in);
        assertEquals(in,out);
    }
    @Test
    public void whitelist2(){
        String in = "file:/Users/onlinestore/good2.xml";
        String out = object.resolveEntity("123", in);
        assertEquals(in,out);
    }

}
