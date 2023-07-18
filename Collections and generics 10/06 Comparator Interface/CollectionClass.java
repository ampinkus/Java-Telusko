import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(105);
        values.add(208);
        values.add(104);
        values.add(777);

        // Define a custom comparator based on the last digit
        Comparator<Integer> lastDigitComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int lastDigit1 = num1 % 10;
                int lastDigit2 = num2 % 10;
                return Integer.compare(lastDigit1, lastDigit2);
            }
        };

        // Sort the list using the custom  lastDigitComparator)
        Collections.sort(values, lastDigitComparator);

        // Iterate over the sorted list and print each element
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}

/*
In this part of the code, we are calculating the last digit of two numbers (num1 and num2) and then comparing those  last digits using
Integer.compare() method. Here's what each step does:

1. num1 % 10 and num2 % 10: The modulus operator % is used to calculate the remainder when num1 and num2 are divided by 10.
Since the remainder will be the last digit of the number, this operation extracts the last digit of each number.

2. lastDigit1 and lastDigit2: The extracted last digits of num1 and num2 are assigned to variables lastDigit1 and lastDigit2 respectively.
These variables will be used for comparison.

3. Integer.compare(lastDigit1, lastDigit2): The Integer.compare() method is used to compare the values of lastDigit1 and lastDigit2.
It returns a negative value if lastDigit1 is less than lastDigit2, a positive value if lastDigit1 is greater than lastDigit2,
and zero if they are equal.

The Comparator interface requires a comparison result of negative, zero, or positive to determine the order of elements.
By using Integer.compare() in the return statement, we provide the necessary result for the comparison based on the last
digits of the numbers.
In the context of the code, this comparison helps sort the numbers in ascending order based on their last digit.


In the given code, the `sort()` method does not explicitly send the two numbers to the `lastDigitComparator`. Instead, the `sort()`
method internally uses the comparator to compare and sort the elements of the list.
Here's how it works:

1. `Collections.sort(values, lastDigitComparator);`: This line of code invokes the `sort()` method from the `java.util.Collections`
class to sort the `values` list. It takes two parameters: the list to be sorted (`values`) and the comparator (`lastDigitComparator`).

2. Inside the `sort()` method implementation, it internally uses the comparator to compare pairs of elements in the list and
rearranges them according to the comparison result.

3. The comparator (`lastDigitComparator`) is responsible for comparing two elements at a time during the sorting process.
The `sort()` method uses this comparator to determine the order in which the elements should be arranged.

So, in summary, the `sort()` method does not explicitly send two numbers to the `lastDigitComparator`. Instead,
it uses the comparator to compare and sort the elements of the list based on the logic defined in the comparator.
The comparator is invoked internally by the `sort()` method as needed to perform the necessary comparisons for sorting the list.
 */