package JK.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Антон", Arrays.asList(new Course("Физика"), new Course("Биология"),
                new Course("Литература"),new Course("Математика"),new Course("Химия"))));
        students.add(new Student("Миша", Arrays.asList(new Course("Математика"), new Course("Биология"),
                new Course("Физика"), new Course("География"))));
        students.add(new Student("Саша", Arrays.asList(new Course("Литература"), new Course("Физика"),
                new Course("Биология"), new Course("Химия"),new Course("История"))));
        students.add(new Student("Оля", Arrays.asList(new Course("Биология"), new Course("Химия"))));
        students.add(new Student("Андрей", Arrays.asList(new Course("Литература"), new Course("Физика"))));

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Testing");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
