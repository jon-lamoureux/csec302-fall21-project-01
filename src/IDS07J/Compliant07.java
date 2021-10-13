package IDS07J;

import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;

public class Compliant07 {
    public static Boolean performRuntime(String input) throws Exception {
        File dir = new File(input);
        if (!dir.isDirectory()) {
            System.out.println("Not a directory");
            return false;
        } else {
            for (String file : dir.list()) {
                System.out.println(file);
            }
        }
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec("cmd.exe /C dir " + dir);
        int result = proc.waitFor();
        if (result != 0) {
            System.out.println("process error: " + result);
        }
        InputStream in = (result == 0) ? proc.getInputStream() :
                proc.getErrorStream();
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        Boolean completed = true;
        return true;
    }
}
