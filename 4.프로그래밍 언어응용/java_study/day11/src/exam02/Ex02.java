package exam02;

public class Ex02 {
    public static void main(String[] args){}
    // 애플이나 애플 하위 클래스만 가능.
    Box<Grape> gBox = new Box<Grape>();
    //gBox.setItem(new Grape());

    //gBox.printInfo();
    Grape grape = gBox.getItem();

    // Box<Grape> = new Box<Grape>();
}
