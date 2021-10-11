package STRJ02Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import STR02J.NonCompliant02;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonCompliant02Test {
    private NonCompliant02 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant02();
    }

    @Test
    public void normalChars() {
        String input = "SCRIPT";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }


    @Test
    public void noScript() {
        String input = "script";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void noContent() {
        String input = "s1c2r3i4p5t6";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }
}
