// I can create a static mathod in an interface
interface  Demo{
    // I can have a variable in a interface, but by default it becomes a constant
    int NUM = 12;
    // I have a method that needs to be implemented in a class
    void abc();
    // I have a static method
    static void show(){
        System.out.println("interface static method");
    }
}

class DemoImp implements Demo{
    public void abc(){
        System.out.println(NUM);
    }
}

public class StaticMethodInterface {
    public static void main(String[] args) {
        // we call the method with the name of the interface
        Demo.show();


    }
}
