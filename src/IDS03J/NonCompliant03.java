package IDS03J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class NonCompliant03 {
    private static final Logger LOGGER = Logger.getLogger(NonCompliant03.class.getName());
    public static String generateLog(String input) throws SecurityException, IOException {
        Boolean loginSuccesful = false;
        if (loginSuccesful) {
            LOGGER.severe("User login succeeded for: " + input);
        } else {
            LOGGER.severe("User login failed for: " + input);
        }
        return input;
    }
}
