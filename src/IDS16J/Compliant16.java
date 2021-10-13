package IDS16J;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Compliant16 {
    public static String createXMLStream(final String quantity) throws IOException, NumberFormatException {
        // Write XML string only if quantity is an unsigned integer (count).
        int count;
        try {
            count = Integer.parseUnsignedInt(quantity);
        }
        catch (java.lang.NumberFormatException e){
            return "<item>\n<description>Widget</description>\n"
                    + "<price>500</price>\n" + "<quantity>0</quantity></item>";
        }
        return "<item>\n<description>Widget</description>\n"
                + "<price>500</price>\n" + "<quantity>" + count + "</quantity></item>";
    }
}