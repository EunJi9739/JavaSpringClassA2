package exam01;

//import java.lang.*;
public class Book /* extends Object */{
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {//Object obj = book1
        //this, Object obj
        //명시적 형변환, 다형성
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if(title.equals(book.title) && author.equals(book.author) && price==book.price){
                return true;
            }
        }
        return false;
    }
}
