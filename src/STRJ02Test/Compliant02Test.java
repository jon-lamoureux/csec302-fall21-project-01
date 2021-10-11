package STRJ02Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import STR02J.Compliant02;

import java.text.DateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class Compliant02Test {
    private Compliant02 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant02();
    }

    @Test
    public void normalChars() {
        String input = "SCRIPT";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void noScript() {
        String input = "script";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void noContent() {
        String input = "<script></script>";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void inputDate() {
        Date date = java.util.Calendar.getInstance().getTime();
        boolean result = compliant.isOctober(date);
        assertTrue(result, "It is October!");
    }

    @Test
    public void invalidDate() {
        Date date = Date.from(ZonedDateTime.now().minusMonths(1).toInstant());
        System.out.println(date);
        boolean result = compliant.isOctober(date);
        assertTrue(result, "It is October!");
    }

    @Test
    public void notADate() {
        Date date = java.util.Calendar.getInstance().getTime();
        System.out.println(date);
        boolean result = compliant.isOctober(date);
        assertNotNull(result, "It is October!");
    }
}
