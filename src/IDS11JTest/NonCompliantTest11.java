package IDS11JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS11J.NonCompliant11;

public class NonCompliantTest11 {
    private NonCompliant11 nonCompliant;

    @BeforeEach
    void setUp() throws Exception {
        nonCompliant = new NonCompliant11();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
