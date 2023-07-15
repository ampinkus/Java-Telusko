package Varargs;

class Calc{
    // create a method
    public int add(int ...n ){  // like writing (4,5,6,7,8,9,10)
        int sum = 0;
        for(int i :n){
            sum = sum + i;
        }
        return sum;
    };
}

public class Varargs {
    public static void main(String[] args) {
        Calc obj = new Calc();

        System.out.println(obj.add(4,5,6,7,8,9,10)); // we can pass any number of values
    }
}
