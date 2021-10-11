package IDS00JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS00J.Compliant00;

public class CompliantTest00 {
    private Compliant00 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant00();
    }

    @Test
    void testStringReplacement() {
        String dir = "#$%*&^$#^#$%^";
        assertEquals(dir, "Strings should be replaced");
    }
}
