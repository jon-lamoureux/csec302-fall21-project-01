package IDS07J;
import java.io.InputStream;

public class NonCompliant07 {
    public static Boolean performRuntime(String input) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process proc = rt.exec("cmd.exe /C dir " + input);
        int result = proc.waitFor();
        if (result != 0) {
            System.out.println("process error: " + result);
            return false;
        }
        InputStream in = (result == 0) ? proc.getInputStream() :
                proc.getErrorStream();
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        return true;
    }
}
