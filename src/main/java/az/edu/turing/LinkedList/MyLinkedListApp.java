package az.edu.turing.LinkedList;

public class MyLinkedListApp {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(10);
        var myLinkedList = new MyLinkedList<>(head);
        System.out.println(myLinkedList);

        Node<Integer> second = new Node<>(11);
        myLinkedList.addTail(second);
        System.out.println(myLinkedList + " " + "Size: " + myLinkedList.getSize());

        Node<Integer> third = new Node<>(13);
        myLinkedList.addTail(third);
        System.out.println(myLinkedList + " " + "Size: " + myLinkedList.getSize());

        int index = 2;
        System.out.println("Index " + index + ": " + myLinkedList.get(index));

        int deleteObject = 3;
        myLinkedList.delete(deleteObject);
        System.out.println("(Object " + deleteObject + " deleted): " + myLinkedList + ", Size: " + myLinkedList.getSize());

   }
}
