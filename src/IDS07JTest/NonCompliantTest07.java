package IDS07JTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS07J.NonCompliant07;

public class NonCompliantTest07 {
    private NonCompliant07 nonCompliant;

    @BeforeEach
    void setUp() throws Exception {
        nonCompliant = new NonCompliant07();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}