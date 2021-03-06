package STRJ02Test;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import STR02J.NonCompliant02;

import java.text.DateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class NonCompliant02Test {
    private NonCompliant02 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new NonCompliant02();
    }

    @Test
    public void normalChars() {
        Locale.setDefault(Locale.TRADITIONAL_CHINESE);
        String input = "SCRIPT";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void noScript() {
        Locale.setDefault(Locale.TRADITIONAL_CHINESE);
        String input = "script";
        boolean result = compliant.processTag(input);
        assertTrue(result, "The string contains 'SCRIPT'");
    }

    @Test
    public void noContent() {
        String input = "";
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
        Locale.setDefault(Locale.TRADITIONAL_CHINESE);
        Date date = java.util.Calendar.getInstance().getTime();
        System.out.println(date);
        boolean result = compliant.isOctober(date);
        assertTrue(result, "It is October!");
    }
}
