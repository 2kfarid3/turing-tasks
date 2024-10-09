package az.edu.turing.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Design");
        tasks.add("Development");
        tasks.add("Teacher");

        Employee employee = new Employee("John", tasks);

        System.out.println(employee.getName());  // John
        System.out.println(employee.getTasks());  // [Design, Development]

         employee.getTasks().add("Testing");  // Bu dışarıdan gelen liste kopyası üzerinde çalışır, orijinal listeyi değiştirmez.

        System.out.println(employee.getTasks());  // Hâlâ [Design, Development] çünkü orijinal liste değişmedi
    }
}
