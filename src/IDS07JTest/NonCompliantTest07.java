package IDS07JTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import IDS07J.NonCompliant;

public class NonCompliantTest {
    private NonCompliant nonCompliant;

    @BeforeEach
    void setUp() throws Exception {
        nonCompliant = new NonCompliant();
    }

    @Test
    public void testWeirdCharacters() {
        String dir = "!@*%*#$%&*$%&*$#";
    }
}
