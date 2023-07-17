// How to handle errors in Java
public class TryCatchFinally {
    public static void main(String[] args) {
       try{
           // block to try a code to intercept an error
           int i = 9/0;
           System.out.println("This will not be printed");
       }
       catch (ArithmeticException e){
           // Block where we catch the exception and execute the code if one happens
           System.out.println("An error happend");
       }
       finally { // in this block we put the lines of code that we will run even after an error
           System.out.println("This will be printed even after an error");
       }
       // as we catched the exception the program continues
        System.out.println("Bye");
    }
}
