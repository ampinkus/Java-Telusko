interface Demo{
    void abc();
    void bcd(); // I can have more than one functional method but if I define it as an @FunctionalInterface only one
    default void show(){ // with default, I can create one default method in an interface, and it can be overridden in the class
        System.out.println("In interface Demo");
    }
}

class ImplementsDemo implements Demo {
    public void abc (){
        System.out.println("In ImplementsDemo");
    }
    public void bcd(){} // doues nothing
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        ImplementsDemo obj = new ImplementsDemo();
        obj.show();
        obj.abc();
    }
}
