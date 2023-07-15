package AbstractExample;

class Printer {
    /*
    public void show(Integer i){
        System.out.println(i);
    }
    // create a method to print doubles (Method overloading)
    public void show(Double i){
        System.out.println(i);
    }
     */
    // Instead of using the above code I can use Number which is an abstract class and I will print any number
    public void show(Number i){
        System.out.println(i);
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5);
        // obj.show(5.5); // gives an error if I defne only a Show for integers
        obj.show(5.5);  //using number no error, since double extends Number

    }
}
