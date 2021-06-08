
public class StringManipulator {

    // Trim both input strings and then concatenate them. Return the new string.
    public String trimAndConcat(String A, String B) {
        String newString;
        newString = A.trim().concat(B.trim());
        return newString;
    }

    // Get the index of the character and return either the index or null. If the
    // character
    // appears multiple times, return the first index.
    public Integer getIndexOrNull(String str, char A) {

        Integer index;

        index = str.indexOf(A);

        if (index != -1) {
            return index;
        } else {
            return null;
        }

    }

    // Get the index of the start of the substring and return either the index or
    // null
    public Integer getIndexOrNull(String word, String subString) {

        Integer index;
        index = word.indexOf(subString);

        if (index != -1) {
            return index;
        } else {
            return null;
        }
    }

    // Get a substring using a starting and ending index, and concatenate that with
    // the second string input to our method.
    public String concatSubstring(String str1, int firstIndex, int lastIndex, String str2) {

        String sub;
        sub = str1.substring(firstIndex, lastIndex);

        return sub.concat(str2);
    }

}