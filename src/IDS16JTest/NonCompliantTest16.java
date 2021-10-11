package IDS16JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS16J.NonCompliant16;

public class NonCompliantTest16 {
    private NonCompliant16 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant16();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&&*$#";
    }
}
