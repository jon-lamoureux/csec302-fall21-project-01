package IDS07JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS07J.Compliant;

public class CompliantTest03 {
    private Compliant compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant();
    }

    @Test
    void testStringReplacement() {
        String dir = "#$%*&^$#^#$%^";
        assertEquals(dir, "Strings should be replaced");
    }
}
