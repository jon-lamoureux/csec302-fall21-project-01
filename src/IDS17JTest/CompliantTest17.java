package IDS17JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS17J.Compliant17;

public class CompliantTest17 {
    private Compliant17 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant17();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
