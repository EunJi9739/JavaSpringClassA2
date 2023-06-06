package exam03;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Ex03 {
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

            //List<String> names = students.stream().map(Student::getName)
                    //.collect(Collectors.toList());
            //System.out.println(names);

        //Set<String> names = students.stream().map(Student::getName).collect(Collectors.toSet());
        //System.out.println(names);

        Map<Integer, Student> students2 = students.stream()
                .collect(toMap(Ex03::keyMapper, s->s));

        students2.entrySet().stream().forEach(System.out::println);

    }
    private static int keyMapper(Student s){
        return Objects.hash(s.getBan(), s.getGrade(), s.getGender(), s.getName());
    }
}
