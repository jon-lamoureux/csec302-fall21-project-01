package IDS03J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.regex.Pattern;

public class Compliant {
    String username = "Guest";
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void generateLog() {
        // add some code of your choice here
        // Moving to the logging part now
        LOGGER.log(Level.INFO, "Log message");
    }
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
