package MethodOverriding;

class A {
public void show(){
    System.out.println("Show in A");
}
}

class B extends A {
    public void show() {
        System.out.println("Show in B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B objB = new B();
        // in both classes they are a method called show() but the method in B overrides the method in A.
        // This is called method override, the child class method will override the parent class method.
        objB.show();

    }
}
