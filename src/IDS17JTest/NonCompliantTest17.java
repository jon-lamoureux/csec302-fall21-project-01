package IDS17JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS17J.NonCompliant17;

public class NonCompliantTest17 {
    private NonCompliant17 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant17();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
