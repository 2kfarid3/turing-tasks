package az.edu.turing.ListAddTask;

public class Main {
    public static void main(String[] args) {
        Student head = new Student("Farid", 19, 51);
        MyList sll = new MyList(new MyList.StudentNode(head, null));
        sll.insertEnd("Bashir", 20, 51);

        // Print
        sll.display();

        // InsertEnd
        sll.insertEnd("Ilham", 20, 51);
        sll.display();
    }
}

