import java.util.ArrayList;

public class ArrayListException {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList.get(0));

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value:" + castedValue);
            } catch (Exception e) {
                System.out.println("There was an error casting '" + myList.get(i) + "' to an integer");
                System.out.println("Error message:" + e);
            }

        }

    }
}
