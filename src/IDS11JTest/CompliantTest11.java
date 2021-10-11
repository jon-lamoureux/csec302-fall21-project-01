package IDS11JTest;
import IDS11J.Compliant11;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import IDS11J.NonCompliant11;


public class CompliantTest11 {


    @Test
    public void testMaliciousCharacters() {
        String maliciousInput = "<scr" + "\uFDEF" + "ipt>";
        assertNotEquals("<script>", Compliant11.filterString(maliciousInput));
    }

    @Test
    public void testnumbers() {
        String maliciousInput = "<scr" + "4" + "ipt>";
        assertEquals("<scr4ipt>", Compliant11.filterString(maliciousInput));
    }

    @Test
    public void testNullCharacters() {
        String maliciousInput = "<scr" + "\u0000" + "ipt>";
        assertNotEquals("<script>", Compliant11.filterString(maliciousInput));
    }


}
