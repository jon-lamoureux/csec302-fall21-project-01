package STR02J;

import java.util.Locale;

public class NonCompliant02 {
    public static boolean processTag(String tag) {
        Locale.setDefault(Locale.TRADITIONAL_CHINESE);
        if (tag.equals("SCRIPT")) {
            return true;
        } else {
            return false;
        }
    }
}
