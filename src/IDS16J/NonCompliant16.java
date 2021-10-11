package IDS16J;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class NonCompliant16 {
    private static void createXMLStreamBad(final BufferedOutputStream outStream,
                                           final String quantity) throws IOException {
        String xmlString = "<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>" + quantity
                + "</quantity></item>";
        outStream.write(xmlString.getBytes());
        outStream.flush();
    }
}
