public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;

    }

    // adding to the tail of the list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Remove element from the tail
    public void remove() {

        if (this.head.next == null) {
            this.head = null;
        }

        Node runner = head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;

    }

    // display elements in singylinked list.

    public String display() {

        if (this.head == null) {
            return null;
        }

        String output = Integer.toString(this.head.value);
        Node runner = this.head.next;

        while (runner != null) {
            output += " - " + runner.value;
            runner = runner.next;
        }

        return output;
    }

}
