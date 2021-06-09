import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main(String[] args) {

        PuzzleJava puzzle = new PuzzleJava();

        // int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        // ArrayList list = puzzle.greaterThan(arr, 10);
        // System.out.println(list.toString());

        // .......

        // ArrayList<String> names = new ArrayList<String>();
        // names.add("Nancy");
        // names.add("Jinichi");
        // names.add("Fujibayashi");
        // names.add("Momochi");
        // names.add("Ishikawa");
        // ArrayList<String> shuffledNames = new ArrayList<String>();
        // shuffledNames = puzzle.shuffleArray(names);
        // System.out.println(shuffledNames);

        // ......

        // creates and shuffles letters of alphabet
        // puzzle.alphabet();

        // ...

        // // randomly generated array
        // int[] rnd;
        // rnd = puzzle.randomNumbers();
        // System.out.println(Arrays.toString(rnd));

        // ....

        // // randomly generate and sort array
        // ArrayList<Integer> sorted = new ArrayList<Integer>();
        // sorted = puzzle.sortedNumbers();
        // System.out.println(sorted.toString());

        // .....

        // // Create random string with 5 characters
        // puzzle.randomString();

        // ..

        // Generates an array with 10 random strings that are each 5 characters long
        puzzle.multiRandomStrings();

    }
}
