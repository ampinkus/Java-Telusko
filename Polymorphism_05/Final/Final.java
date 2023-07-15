package Final;

final class A{ // a final class cannot be extended
    final int i = 0; // is like to declare it as a constant, should be all in capital letters!
    public A(){
        // change i inside the constructor
        // i = 10; gives an error
    }
}

// class B extends A{} gives and error
// if I declare a method in a class as final it can not be overridden by another method in another class


public class Final {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);


    }
}
