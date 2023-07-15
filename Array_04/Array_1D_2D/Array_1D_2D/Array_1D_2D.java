package Array_1D_2D;

class Students{
    int studentID;
    String name;
}

public class Array_1D_2D {
    public static void main(String[] args) {
        // fixed size array of 4
        int nums[] = new int[4];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        System.out.println(nums[2]);

        int nums2[] = {1,2,3,4}; // load the array at start
        for (int number : nums2) {
            System.out.println(number);
        }

        // array of objects Students
        Students st1 = new Students();
        Students st2 = new Students();
        Students st3 = new Students();
        Students st4 = new Students();

        st1.name = "Fredi";
        st1.studentID = 12;

        Students s[] = {st1,st2,st3,st4};
        System.out.println(s[0].name + " : " + s[0].studentID);

        // multidimensional array 3x3 in this case
        int matrix [][]  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[0][0]);

        // Enhanced for loop to print the matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }



    }
}
