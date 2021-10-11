package IDS03JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS03J.Compliant03;

public class CompliantTest03 {
    private Compliant03 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant03();
    }

    @Test
    void testStringReplacement() {
        String dir = "#$%*&^$#^#$%^";
        assertEquals(dir, "Strings should be replaced");
    }
}
