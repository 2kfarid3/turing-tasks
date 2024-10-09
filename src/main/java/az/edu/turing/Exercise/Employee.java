package az.edu.turing.Exercise;

import java.util.ArrayList;
import java.util.List;

public final class Employee {
    private final String name;
    private final List<String> tasks;

    public Employee(String name, List<String> tasks) {
        this.name = name;
        // Yeni bir liste oluşturarak referansı kopyalıyoruz
        this.tasks = new ArrayList<>(tasks);
    }

    public String getName() {
        return name;
    }

    // Görevlerin bir kopyasını döndürüyoruz, böylece dışarıdan değiştirilmesi engelleniyor
    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}

