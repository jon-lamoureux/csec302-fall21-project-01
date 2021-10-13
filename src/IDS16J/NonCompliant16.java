package IDS16J;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class NonCompliant16 {
    public static String createXMLStreamBad(final String quantity) throws IOException {
        return "<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>" + quantity
                + "</quantity></item>";
    }
}
