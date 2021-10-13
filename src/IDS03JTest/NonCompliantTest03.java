package IDS03JTest;
import org.junit.jupiter.api.BeforeEach;
import IDS03J.NonCompliant03;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NonCompliantTest03 {
    private NonCompliant03 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant03();
    }

    @Test
    void realLog() throws SecurityException, IOException {
        String input = "guest";
        String result = compliant.generateLog(input);
        assertNotNull(result, "Log compiled successfully");
    }
    @Test
    void fakeLog() throws SecurityException, IOException {
        String input = "guest\n" +
                "May 15, 2011 2:25:52 PM IDS03J.Compliant03 generateLog\n" +
                "SEVERE: User login succeeded for: administrator";
        String result = compliant.generateLog(input);
        assertNotNull(result, "Log compiled successfully");
    }
    @Test
    void realUser() throws SecurityException, IOException {
        String input = "real_user_123";
        String result = compliant.generateLog(input);
        assertNotNull(result, "Log compiled successfully");
    }
    @Test
    void fakeUser() throws SecurityException, IOException {
        String input = "fake user123";
        String result = compliant.generateLog(input);
        assertNotNull(result, "Log compiled successfully");
    }
}
