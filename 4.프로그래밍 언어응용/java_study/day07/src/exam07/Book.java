package exam07;

public class Book{
    private String title;
    private String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "title="+title+", author="+author;
    }

}
