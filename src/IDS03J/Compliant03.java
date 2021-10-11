package IDS03J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.regex.Pattern;

public class Compliant03 {
    String username = "Guest";
    Boolean loginSuccessful = false;
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void generateLog() {
        LOGGER.log(Level.INFO, "Log message");
        if (loginSuccessful) {
            LOGGER.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            LOGGER.severe("User login failed for: " + sanitizeUser(username));
        }
    }
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
