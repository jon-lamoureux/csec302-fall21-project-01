package IDS07JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS07J.NonCompliant07;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonCompliantTest07 {
    private NonCompliant07 nonCompliant;

    @BeforeEach
    void setUp() throws Exception {
        nonCompliant = new NonCompliant07();
    }

    @Test
    public void testValid() throws Exception {
        Boolean result = nonCompliant.performRuntime("src");
        assertTrue(result);
    }

    @Test
    public void testInvalid() throws Exception {
        Boolean result = nonCompliant.performRuntime("");
        assertTrue(result);
    }

    @Test
    public void testExploit() throws Exception {
        Boolean result = nonCompliant.performRuntime("adfasdf & echo Illegal Text");
        assertTrue(result);
    }

    @Test
    public void testIP() throws Exception {
        Boolean result = nonCompliant.performRuntime("src & ipconfig");
        assertTrue(result);
    }
}
