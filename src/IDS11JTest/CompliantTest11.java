package IDS11JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS11J.Compliant11;

public class CompliantTest11 {
    private Compliant11 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant11();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
