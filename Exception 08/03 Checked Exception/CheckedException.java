import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// buffer scanner and reader
public class CheckedException {
    public static void main(String[] args) throws IOException { // suggested by the compiler
        System.out.println("Enter a number: ");
        BufferedReader br = null;
        Integer n = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine()); // the compiler knows that this may give an exception, this is a Checked Exception
        }
       catch (Exception e) {
           System.out.println("Exception: " + e);
       }
        finally {
            br.close();  // to stop to use the resource
        }
        System.out.println("Input is: " + n);
    }
}
