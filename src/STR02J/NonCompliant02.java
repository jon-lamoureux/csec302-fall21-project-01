package STR02J;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;


public class NonCompliant02 {
    public static boolean processTag(String tag) {
        if (tag.equals("SCRIPT")) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isOctober(Date date) {
        String myString = DateFormat.getDateInstance().format(date);
        System.out.println("The date is " + myString);
        if (myString.startsWith("Oct ")) {
            System.out.println("It is October!");
            return true;
        } else {
            System.out.println("It's not October.");
            return false;
        }
    }
}

