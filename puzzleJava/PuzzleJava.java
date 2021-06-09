import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    //// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print
    //// the sum of all
    // numbers in the array. Also have the function return an array that only
    //// includes numbers
    // that are greater than 10 (e.g. when you pass the array above, it should
    //// return an array
    // with the values of 13,25,32)

    public ArrayList<Integer> greaterThan(int[] arr, int num) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                newArray.add(arr[i]);
            }
            sum += arr[i];
        }
        System.out.println("Sum of the array is:" + sum);
        return newArray;
    }

    // Shuffle name array and print the name of each person. Have the method also
    // return
    // an array with names that are longer than 5 characters.
    public ArrayList<String> shuffleArray(ArrayList<String> nameList) {

        ArrayList<String> newNameList = new ArrayList<String>();
        Collections.shuffle(nameList);
        System.out.println("Shuffled array" + nameList);

        for (String name : nameList) {
            System.out.println("hello " + name);
            if (name.length() > 5) {
                newNameList.add(name);
            }
        }

        return newNameList;
    }

    // Create an array that contains all 26 letters of the alphabet (this array must
    // have 26
    // values). Shuffle the array and, after shuffling, display the last letter from
    // the array
    // Have it also display the first letter of the array. If the first letter in
    // the array
    // is a vowel, have it display a message.
    public void alphabet() {

        ArrayList<Character> alpha = new ArrayList<Character>();

        for (int i = 0; i < 26; i++) {
            // adds a lowercase letter of alphabet to arraylist by casting to characters
            alpha.add((char) (97 + i));
        }
        System.out.println(alpha);
        Collections.shuffle(alpha);
        System.out.println(alpha);

        char firstLetter = alpha.get(0);
        System.out.println("The first letter is:" + firstLetter);
        System.out.println("The last letter is:" + alpha.get(alpha.size() - 1));
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
                || firstLetter == 'u') {
            System.out.println("The first letter " + firstLetter + " is a Vowel");
        }

    }

    // Generate and return an array with 10 random numbers between 55-100
    public int[] randomNumbers() {

        int[] randomArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            randomArray[i] = rand.nextInt(100 + 1 - 55) + 55;
        }
        return randomArray;
    }

    // Generate and return an array with 10 random numbers between 55-100 and have
    // it be sorted (showing the smallest number in the beginning). Display all the
    // numbers in the array. Next, display the minimum value in the array as well as
    // the
    // maximum value.
    public ArrayList<Integer> sortedNumbers() {

        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        Random rand = new Random();
        int randomNumber;
        // int min = 100;
        // int max = 55;
        for (int i = 0; i < 10; i++) {
            randomNumber = rand.nextInt(100 + 1 - 55) + 55;
            sortedArray.add(randomNumber);
            // if (min > randomNumber) {
            // min = randomNumber;
            // }
            // if (max < randomNumber) {
            // max = randomNumber;
            // }
        }
        Collections.sort(sortedArray);
        // System.out.println("Minimum number is:" + min);
        System.out.println("Minimum number is:" + sortedArray.get(0));
        // System.out.println("Maximum number is:" + max);
        System.out.println("Maximum number is:" + sortedArray.get(sortedArray.size() - 1));
        return sortedArray;
    }

    // .................................

    // Create a random string that is 5 characters long.

    public void randomString() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        int length = 5;

        for (int i = 0; i < length; i++) {

            int index = rnd.nextInt(alphabet.length());
            char randChar = alphabet.charAt(index);
            str.append(randChar);
        }
        String newString = str.toString();
        System.out.println("Random String is: " + newString);
    }

    // ...........................

    // Generate an array with 10 random strings that are each 5 characters long
    public void multiRandomStrings() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        Random rnd = new Random();

        ArrayList<String> randomStrings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            int length = 5;
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < length; j++) {

                int index = rnd.nextInt(alphabet.length());
                char randChar = alphabet.charAt(index);
                str.append(randChar);
            }
            String newString = str.toString();
            randomStrings.add(newString);

        }
        System.out.println("Random Strings: " + randomStrings);
    }

}
