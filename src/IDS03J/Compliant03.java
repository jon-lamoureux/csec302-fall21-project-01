package IDS03J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Compliant03 {
    private static final Logger LOGGER = Logger.getLogger(Compliant03.class.getName());
    public static String generateLog(String input) throws SecurityException, IOException {
        Boolean loginSuccesful = false;
        if (loginSuccesful) {
            LOGGER.severe("User login succeeded for: " + sanitizeUser(input));
        } else {
            LOGGER.severe("User login failed for: " + sanitizeUser(input));
        }
        return input;
    }
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}
