package IDS00JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS00J.NonCompliant00;

public class NonCompliantTest00 {
    private NonCompliant00 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant00();
    }

    @Test
    void testStringReplacement() {
        String dir = "#$%*&^$#^#$%^";
        assertEquals(dir, "Strings should be replaced");
    }
}
