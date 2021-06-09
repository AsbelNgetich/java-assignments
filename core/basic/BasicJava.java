import java.util.ArrayList;

public class BasicJava {

    // Write a method that prints all the numbers from 1 to 255.
    public void numbers() {

        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }

    }

    // Write a method that prints all the odd numbers from 1 to 255.
    public void oddNumbers() {

        for (int i = 1; i <= 255; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

    // Write a method that prints the numbers from 0 to 255, but this time print
    // the sum of the numbers that have been printed so far.
    public void sumNumbers() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number:" + i + " Sum:" + sum);
        }
    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate
    // through each
    // member of the array and print each value on the screen.

    public void arrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
    }

    // Write a method (sets of instructions) that takes any array and prints the
    // maximum value
    // in the array. Your method should also work with a given array that has all
    // negative
    // numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative
    // numbers and
    // zero

    public void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }

    // calculates the average
    public void average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        double ave = sum / (double) arr.length;
        System.out.println(ave);
    }

    // creates an array with odd numbers from 1 - 255
    // Write a method that prints all the odd numbers from 1 to 255.
    public ArrayList<Integer> oddArray() {

        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 1; i <= 255; i++) {

            if (i % 2 != 0) {
                y.add(i);
            }
        }

        return y;

    }

    // Returns the number of values in an array whose value is greater than a given
    // value y.
    public int greaterThan(int[] arr, int y) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (y < arr[i])
                sum++;
        }

        return sum;
    }

    // This method multiplies each value in the array by itself.
    public int[] square(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        return arr;
    }

    // Given any array x, say [1, 5, 10, -2], this method replaces any negative
    // number with the value of 0.
    // This method multiplies each value in the array by itself.
    public int[] replaceNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        return arr;
    }

    public ArrayList<Object> minMaxAve(int[] arr) {

        ArrayList<Object> newArray = new ArrayList<Object>();
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        double average;
        double length = arr.length;
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

            sum += arr[i];
        }
        average = sum / length;
        newArray.add(max);
        newArray.add(min);
        newArray.add(average);

        return newArray;

    }

    public int[] shiftArray(int[] arr) {

        int lastIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i == lastIndex) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }

}
