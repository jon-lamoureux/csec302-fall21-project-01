package IDS16JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS16J.Compliant16;

public class CompliantTest16 {
    private Compliant16 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant16();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
