import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {

        BasicJava nums = new BasicJava();

        // prints numbers 1-255
        // nums.numbers();

        // prints odd numbers from 1 to 255
        // nums.oddNumbers();

        // prints sum of numbers
        // nums.sumNumbers();

        // int[] x = { -7, -3, -9 };
        // prints array values
        // nums.arrays(x);

        // prints the Max value in a given array
        // nums.maxValue(x);

        // prints the average of array value
        // nums.average(x);

        // ArrayList<Integer> odds = new ArrayList<Integer>();
        // // returns an array of odd numbers
        // odds = nums.oddArray();
        // System.out.println(odds);

        // int[] arrayX = { 4, -3, -6, 5 };
        // // Returns the total number of values in and array thats greater than the
        // value
        // // passed in
        // int total = nums.greaterThan(arrayX, -3);
        // System.out.println(total);

        // // squares array elements
        // int[] squaredArray;
        // squaredArray = nums.square(arrayX);
        // System.out.println(Arrays.toString(squaredArray));

        // //Replaces all negative values with a zero
        // int[] positiveArray;
        // positiveArray = nums.replaceNegative(arrayX);
        // System.out.println(Arrays.toString(positiveArray));

        // // returns max, min and average of a given array
        // int[] arrX = { 4, 3, 7, 5 };
        // ArrayList<Object> newArr = new ArrayList<Object>();
        // newArr = nums.minMaxAve(arrX);
        // System.out.println(newArr.toString());

        // shifts numbers in the array
        int[] x = { 1, 5, 10, 7, -2 };
        int[] shiftedArray;
        shiftedArray = nums.shiftArray(x);
        System.out.println(Arrays.toString(shiftedArray));

    }

}