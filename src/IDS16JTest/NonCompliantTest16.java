package IDS16JTest;
import IDS16J.Compliant16;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS16J.NonCompliant16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class NonCompliantTest16 {


    @Test
    public void MaliciousInput() throws IOException {
        String dir = "1</quantity><price>1.0</price><quantity>1";
        BufferedOutputStream outStream;
        outStream = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String out = NonCompliant16.createXMLStreamBad(dir);
        assertEquals("<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>0</quantity></item>",out);
    }

    @Test
    public void HonestInput() throws IOException {
        String dir = "1";
        BufferedOutputStream outStream;
        outStream = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String out = NonCompliant16.createXMLStreamBad(dir);
        assertEquals("<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>1</quantity></item>",out);
    }

    @Test
    public void GarbageInput() throws IOException {
        String dir = "3u4n%&**&(&*^^&cb34tc3iu4c";
        BufferedOutputStream outStream;
        outStream = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String out = NonCompliant16.createXMLStreamBad(dir);
        assertEquals("<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>0</quantity></item>",out);
    }

}
