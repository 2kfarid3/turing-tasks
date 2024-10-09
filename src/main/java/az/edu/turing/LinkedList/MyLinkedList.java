package az.edu.turing.LinkedList;

 class MyLinkedList<E> {
    private int size;
    private Node<E> head;

    public MyLinkedList(Node<E> head) {
        this.head = head;
        this.size = 1;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public void addTail(Node<E> tail){
        Node<E> curr = head;
        if (curr == null){
            tail = null;
        } else {
            while (curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(tail);
        }
        size++;
    }

     public E get(int index) {
         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Index out of bounds: " + index);
         }
         Node<E> curr = head;
         for (int i = 0; i < index; i++) {
             curr = curr.getNext();
         }
         return curr.getData();
     }

     public void delete(int index) {
         if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("Index out of bounds: " + index);
         }
         if (index == 0) {
             head = head.getNext();
         } else {
             Node<E> prev = head;
             Node<E> curr = head.getNext();
             for (int i = 1; i < index; i++) {
                 prev = curr;
                 curr = curr.getNext();
             }
             prev.setNext(curr.getNext());
         }
         size--;
     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = head;
        while (curr != null){
            sb.append(curr);
            sb.append("-->");
            curr = curr.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
