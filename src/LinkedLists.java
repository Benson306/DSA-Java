import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        //Linked List as a Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        //Linked List as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E"); // Add 'E' to position 4
        linkedList.remove("E"); // Remove element 'E' from the linked List


        linkedList.peekFirst(); // See What is first in the Linked List
        linkedList.peekLast(); // See What is last in the Linked List
        linkedList.addFirst("Q"); // Add to the beginning of the Linked List
        linkedList.addLast("Z"); // Add to the end of the Linked List
        linkedList.removeFirst(); //Remove first element of the Linked List
        linkedList.removeLast(); //Remove last element of the Linked List
        linkedList.indexOf("E"); // Get the index position of an Element

    }
}
