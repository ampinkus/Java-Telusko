import ValueZero.valueZeroException;

public class Main {
    public static void main(String[] args) {
        int i,j = 0;
        i = 3;
        j = 7;
        try {
            int k = i / j;
            if(k==0)
                throw new valueZeroException("the division is 0"); // we can send an error message
            System.out.println("k is: " + k);
        }
        catch( Exception e){
            System.out.println("Error: "+ e);
        }
        catch (valueZeroException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}
