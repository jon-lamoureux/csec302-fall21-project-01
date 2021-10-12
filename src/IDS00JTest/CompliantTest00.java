package IDS00JTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import IDS00J.Compliant00;

import java.sql.SQLException;


public class CompliantTest00 {
    private Compliant00 compliant;

    @BeforeEach
    void setUp() throws Exception {
        compliant = new Compliant00();
    }

    @Test
    void validConnection() throws SQLException {
        String result = compliant.doPrivilegedAction("user", "password");
        System.out.println(result);
        assertNotNull(result, "Logged in");
    }

    @Test
    void invalidConnection() throws SQLException {
        String result = compliant.doPrivilegedAction("baduser", "badpass");
        System.out.println(result);
        assertNotNull(result, "Logged in");
    }

    @Test
    void sqlInjection() throws SQLException {
        String result = compliant.doPrivilegedAction("user' OR '1'='1", "o");
        System.out.println(result);
        assertNotNull(result, "Logged in");
    }

    @Test
    void sqlBadInjection() throws SQLException {
        String result = compliant.doPrivilegedAction("ood' OR '1'='1", "o");
        System.out.println(result);
        assertNotNull(result, "Logged in");
    }

}
