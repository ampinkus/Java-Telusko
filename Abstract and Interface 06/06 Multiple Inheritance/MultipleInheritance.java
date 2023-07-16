
interface Demo {
    void abc();
    default void show(){
        System.out.println("In Show");
    }
}
interface MyDemo{
    default void show(){
        System.out.println("In Show");
    }
}
class DemoImp implements Demo, MyDemo  {
    public  void abc(){
        System.out.println("In abc");
    }
    public void show(){
        System.out.println("In DemoImp Show");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
