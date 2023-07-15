package Inheritance;
// create a simple add calculator
class Calculator { // Super class
    // Method
    public int add(int j, int k){
        return j + k;
    };
}

// now I create another advanced calculator that add and subtracts but I
//  want to use the add code from the Calculator class
class CalculatorAdvanced  extends Calculator{ // Sub class
    // Method subtract
    public int sub(int j, int k){
        return j - k;
    };
}

class CalculatorFull extends CalculatorAdvanced{ // inherits the operations from CalculatorAdvanced and adds *
    public int mult(int j, int k){
        return j * k;
    };
}

public class Inheritance {
    public static void main(String[] args) {
        Calculator Casio = new Calculator();
        int result = Casio.add(3,5);
        System.out.println(result);

        CalculatorAdvanced HP = new CalculatorAdvanced();
        result = HP.add(12,8);
        System.out.println(result);
        result = HP.sub(20,5);
        System.out.println(result);

        CalculatorFull Texas = new CalculatorFull();
        result = Texas.mult(4,6);
        System.out.println(result);
    }
}
