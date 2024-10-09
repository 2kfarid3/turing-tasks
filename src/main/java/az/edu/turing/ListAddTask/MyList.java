package az.edu.turing.ListAddTask;

public class MyList {
    private StudentNode head;
    private int size;

    public MyList(StudentNode head) {
        this.head = head;
        this.size = 1;
    }

    static class StudentNode {
        private Student data;
        private StudentNode next;

        public StudentNode(Student data, StudentNode next) {
            this.data = data;
            this.next = next;
        }

        public Student getData() {
            return data;
        }

        public void setData(Student data) {
            this.data = data;
        }
    }

    public void display() {
        StudentNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void insertEnd(String name, int age, double grade) {
        Student newNode = new Student(name, age, grade);
        StudentNode newNodeNode = new StudentNode(newNode, null);
        if (head == null) {
            head = newNodeNode;
        } else {
            StudentNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNodeNode;
        }
        size++;
    }
}
