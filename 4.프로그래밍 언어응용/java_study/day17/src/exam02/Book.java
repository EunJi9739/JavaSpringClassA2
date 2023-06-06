package exam02;

import java.io.Serializable;

public class Book implements Serializable { //Serializable 넣으면 오류 X
    private static final long serialVersionUID = 1L; //버전 관리
    private String title;
    private transient String bookName;
    //직렬화 할 때 책이름은 제외,,

    private String author;
    //객체를 복구하는데 클래스가 바뀌면 복구가 X

    public Book(String title, String bookName) {
        this.title = title;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
