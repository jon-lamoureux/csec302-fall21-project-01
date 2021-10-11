package IDS07JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS07J.Compliant07;

public class CompliantTest07 {
    private Compliant07 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant07();
    }

    @Test
    void testStringReplacement() {
        String dir = "#$%*&^$#^#$%^";
        assertEquals(dir, "Strings should be replaced");
    }
}
