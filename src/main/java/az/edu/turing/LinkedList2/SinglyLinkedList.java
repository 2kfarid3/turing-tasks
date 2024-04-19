package az.edu.turing.LinkedList2;

public class SinglyLinkedList<E> {
    private ListNode<E> head;
    private int size;

    public SinglyLinkedList(ListNode<E> head) {
        this.head = head;
        this.size = 1;
    }

    private static class ListNode<E> {
        final private E data;
        private ListNode<E> next;

        public ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }
    }

    public void display() {
        ListNode<E> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int length(){
        int count = 0;
        if (head == null){
            return 0;
        }
        ListNode<E> curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void insertBegin(E value) {
        ListNode<E> newNode = new ListNode<>(value, null);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertEnd(E value) {
        ListNode<E> newNode = new ListNode<>(value, null);
        if (head == null) {
            head = newNode;
        } else {
            ListNode<E> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    public E getIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        ListNode<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.getData();
    }

    public void insertGivenPosition(E value, int index) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        ListNode<E> newNode = new ListNode<>(value, null);
        if (index == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode<E> prev = head;
            for (int i = 1; i < index - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void deleteFirstNode(){
        if (head == null){
            System.out.println("Null");
        } else {
            ListNode<E> temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("Null");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        ListNode<E> curr = head;
        ListNode<E> prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        size--;
    }


    public void deleteNode(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (index == 1) {
            if (head == null) {
                System.out.println("null");
                return;
            }
            head = head.next;
        } else {
            ListNode<E> prev = head;
            for (int i = 1; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }


    public static void main(String[] args) {
        ListNode<Integer> first = new ListNode<>(10, null);
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>(first);
        ListNode<Integer> second = new ListNode<>(1, null);
        ListNode<Integer> third = new ListNode<>(8, null);
        ListNode<Integer> fourth = new ListNode<>(11, null);

        // We connect them together for to form a chain
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Print
        sll.display();
        System.out.println("Size: " + sll.length());

        //InsertBegin
        sll.insertBegin(15);
        sll.display();
        System.out.println("Size: " + sll.length());

        //InsertEnd
        sll.insertEnd(20);
        sll.display();
        System.out.println("Size: " + sll.length());

        //GetIndex
       /* sll.display();
        System.out.println("Size: " + sll.length());                    //Error
        System.out.println("Element at index 3: " + sll.getIndex(3)); */

        //InsertGivenPosition
        sll.insertGivenPosition(100,3);
        sll.display();
        System.out.println("Size: " + sll.length());

        //DeleteNode
        sll.deleteNode(3);
        sll.display();
        System.out.println("Size: " + sll.length());

        //DeleteFirstNode
        sll.deleteFirstNode();
        sll.display();
        System.out.println("Size: " + sll.length());

        //DeleteLastNode
        sll.deleteLastNode();
        sll.display();
        System.out.println("Size: " + sll.length());


    }
}

