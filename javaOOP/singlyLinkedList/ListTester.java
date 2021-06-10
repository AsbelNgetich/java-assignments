public class ListTester {
    public static void main(String[] args) {

        SinglyLinkedList mySll = new SinglyLinkedList();
        mySll.add(8);
        mySll.add(2);
        mySll.add(3);
        mySll.add(7);
        mySll.add(9);
        mySll.add(1);
        System.out.println(mySll.head.value);
        String listValues = mySll.display();
        System.out.println(listValues);
        mySll.remove();
        listValues = mySll.display();
        System.out.println(listValues);

        // System.out.println(mySll.head.value);
    }

}
