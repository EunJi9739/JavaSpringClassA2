package exam03;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student(1, 'F',3, "천이름"),
                new Student(2, 'M',3, "이이름"),
                new Student(3, 'F',3, "김이름"),
                new Student(1, 'M',2, "박이름"),
                new Student(2, 'F',2, "최이름"),
                new Student(1, 'M',2, "강이름"),
                new Student(3, 'F',1, "구이름"),
                new Student(2, 'M',1, "홍이름"),
                new Student(1, 'F',1, "하이름"),
                new Student(1, 'M',3, "이이름")
        );

        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        Set<String> names2 = students.stream().map(Student::getName).collect(Collectors.toSet());
        System.out.println(names2);

        ArrayList<String> names3 = students.stream().map(Student::getName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(names3);

        Map<Integer, Student> students2 = students.stream().collect(Collectors
                .toMap(s -> Objects.hash(s.getBan(), s.getGrade(), s.getGender(), s.getName()),
                        Function.identity()));
        System.out.println(students2);

        students2.entrySet().stream().forEach(System.out::println);
    }
}
