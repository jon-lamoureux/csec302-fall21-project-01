package STR02J;

import java.util.Locale;

public class Compliant02 {
    public static boolean processTag(String tag) {
        if (tag.toUpperCase(Locale.ENGLISH).equals("SCRIPT")) {
            return true;
        } else {
            return false;
        }
    }
}
