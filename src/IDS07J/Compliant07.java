package IDS07J;

import java.io.InputStream;
import java.util.regex.Pattern;

public class Compliant {
    public static void main(String[] args) throws Exception {
        String dir = System.getProperty("dir");
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec("cmd.exe /C dir " + dir);
        if (!Pattern.matches("[0-9A-Za-z@.]+", dir)) {
            System.out.println("process error: illegal input");
            return;
        }
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
    }
}
