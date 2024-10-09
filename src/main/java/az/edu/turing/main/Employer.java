package az.edu.turing.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employer {
    int id;
    String name;
    int salary;

    public Employer(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employer> employerList = Arrays.asList(
                 new Employer(1,"John",2000),
                 new Employer(2,"Mike",3000),
                 new Employer(3,"Star",4000)
                 );

        employerList.stream().
                filter(s->s.salary>2000).map(s->s.salary).forEach(System.out::println);



    }
}
