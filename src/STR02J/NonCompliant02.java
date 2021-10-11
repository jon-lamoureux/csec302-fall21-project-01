package STR02J;

import java.util.Locale;

public class NonCompliant02 {
    public static boolean processTag(String tag) {
        if (tag.equals("SCRIPT")) {
            return true;
        } else {
            return false;
        }
    }
}
