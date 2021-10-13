package IDS03JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS03J.Compliant03;

import java.io.IOException;

public class CompliantTest03 {
    private Compliant03 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant03();
    }

    @Test
    void realLog() throws SecurityException, IOException {
        String input = "guest";
        Boolean result = compliant.generateLog(input);
        assertTrue(result, "Log compiled successfully");
    }

    @Test
    void fakeLog() throws SecurityException, IOException {
        String input = "guest\n" +
                "May 15, 2011 2:25:52 PM IDS03J.Compliant03 generateLog\n" +
                "SEVERE: User login succeeded for: administrator";
        Boolean result = compliant.generateLog(input);
        assertTrue(result, "Log compiled successfully");
    }

    @Test
    void realUser() throws SecurityException, IOException {
        String input = "real_user_123";
        Boolean result = compliant.generateLog(input);
        assertTrue(result, "Log compiled successfully");
    }

    @Test
    void fakeUser() throws SecurityException, IOException {
        String input = "fake user123";
        Boolean result = compliant.generateLog(input);
        assertTrue(result, "Log compiled successfully");
    }
}
