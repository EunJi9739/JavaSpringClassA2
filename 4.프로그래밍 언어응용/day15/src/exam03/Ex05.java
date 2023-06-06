package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex05 {
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

        Map<Boolean, List<Student>> studentsByGender = students.stream()
                .collect(Collectors.partitioningBy(Student::isFemale));

        List<Student> females = studentsByGender.get(true);
        List<Student> males = studentsByGender.get(false);

        System.out.println(females);
        System.out.println(males);
    }
}
