import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if I don't want to catch the error but close the resource
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        Integer n = null;
        // up Java 1.7 the resource will close automatically
        // I can get rid of the catch and add after try in ()
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n = Integer.parseInt(br.readLine()); // the compiler knows that this may give an exception, this is a Checked Exception
        }
        System.out.println("Input is: " + n);
    }
}

/*
The `try` block in the given code is used for resource management and exception handling. Let's break down the code and understand how it works:
try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    n = Integer.parseInt(br.readLine());
}
In this code, a `try` block is used to create and manage a `BufferedReader` object to read input from the user.
The `BufferedReader` is created using `System.in` as the input stream source and wrapped inside an `InputStreamReader` to convert the byte
stream to character stream. The `BufferedReader` object is declared and initialized within the parentheses after the `try` keyword.

Here's how the `try` block works:
1. The resource (in this case, the `BufferedReader` object) created in the parentheses after `try` is automatically closed at the end of the block,
ensuring that the resource is properly released even if an exception occurs. This feature is available in Java 7 and later versions and is
known as "try-with-resources."

2. Inside the `try` block, the line `n = Integer.parseInt(br.readLine());` reads a line of input from the user through the `BufferedReader`
object and attempts to parse it as an `Integer`. The `readLine()` method throws an `IOException`, which is a checked exception, meaning it
must be handled or declared in the method signature.

If an exception occurs during the execution of the code within the `try` block, the flow of control will immediately jump to the appropriate `catch`
block (if provided) or to the end of the `try` block. In this case, the code doesn't have a `catch` block for `IOException`, but
it declares that the `main` method itself may throw an `IOException` by specifying `throws IOException` in the method signature.

After the `try` block, the code continues with the line `System.out.println("Input is: " + n);` to display the value of `n`, which should
contain the user's input if it was successfully parsed as an `Integer`.

By using the `try-with-resources` syntax, the code ensures that the `BufferedReader` resource is properly closed, even
if an exception occurs while reading the input. It helps in managing resources efficiently and reducing the risk of resource leaks.
*/
