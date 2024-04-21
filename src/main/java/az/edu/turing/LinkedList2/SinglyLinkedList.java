package az.edu.turing.LinkedList2;

public class SinglyLinkedList<E> {
    private ListNode<E> head;
    private int size;

    public SinglyLinkedList(ListNode<E> head) {
        this.head = head;
        this.size = 1;
    }

    private static class ListNode<E> {
        private E data;
        private ListNode<E> next;

        public ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
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

    public int length() {
        int count = 0;
        if (head == null) {
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

    public E getIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }
        ListNode<E> curr = head;
        for (int i = 1; i < index; i++) {
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

    public void deleteFirstNode() {
        if (head == null) {
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

    public void updateIndex(int index, E value) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        ListNode<E> curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.data = value;
    }

    public void delete(E value){
        if (head == null){
            System.out.println("Null");
            return;
        }

        if (head.data.equals(value)){
            deleteFirstNode();
            return;
        }

        ListNode<E> curr = head;
        while (curr != null && !curr.data.equals(value)){
            curr = curr.next;
        }
        if (curr != null){
            int index = 1;
            ListNode<E> temp = head;
            while (temp != curr){
                temp = temp.next;
                index++;
            }
            deleteNode(index);
        } else {
            System.out.println("This value is null!");
        }
    }



    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(10, null);
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>(head);
        sll.insertEnd(1);
        sll.insertEnd(8);
        sll.insertEnd(11);

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

        //InsertGivenPosition
        sll.insertGivenPosition(100, 3);
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

        //GetIndex
        sll.display();
        System.out.println("Size: " + sll.length());
        System.out.println("Element at index 3: " + sll.getIndex(3));

        //UpdateIndex
        sll.updateIndex(3,55);
        sll.display();
        System.out.println("Size: " + sll.length());
        System.out.println("Element at index 3: " + sll.getIndex(3));

        //DeleteObject
        sll.delete(55);
        sll.display();
        System.out.println("Size: " + sll.length());
        System.out.println("Element at index 3: " + sll.getIndex(3));
    }
}

