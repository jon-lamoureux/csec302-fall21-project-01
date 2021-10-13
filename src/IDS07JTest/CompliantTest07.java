package IDS07JTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS07J.Compliant07;

public class CompliantTest07 {
    private Compliant07 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant07();
    }

    @Test
    public void testValid() throws Exception {
        Boolean result = compliant.performRuntime("src");
        assertTrue(result);
    }

    @Test
    public void testInvalid() throws Exception {
        Boolean result = compliant.performRuntime("");
        assertTrue(result);
    }
    @Test
    public void testExploit() throws Exception {
        Boolean result = compliant.performRuntime("adfasdf & echo Illegal Text");
        assertTrue(result);
    }

    @Test
    public void testIP() throws Exception {
        Boolean result = compliant.performRuntime("src & ipconfig");
        assertTrue(result);
    }
}
