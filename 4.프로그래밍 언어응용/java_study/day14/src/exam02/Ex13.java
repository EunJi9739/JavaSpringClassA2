package exam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex13 {
    public static void main(String[] args){
        List<Book> books = Arrays.asList(
                new Book("책1","저자1"),
                new Book("책3","저자1"),
                new Book("책1","저자99"),
                new Book("책2","저자2"),
                new Book("책5","저자3"),
                new Book("책4","저자4")
        );

        books.stream().sorted().forEach(System.out::println);

        System.out.println("--------------------------");

        //Comparator<Book> comparator = (Comparator<Book>)Comparator.naturalOrder()
                    //.thenComparing(Book::compareToAuthor);
        //books.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
