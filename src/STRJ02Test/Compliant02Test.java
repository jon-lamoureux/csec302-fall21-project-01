package STRJ02Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import STR02J.Compliant02;

public class Compliant02Test {
    private Compliant02 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant02();
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
        String input = "<script></script>";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

}
