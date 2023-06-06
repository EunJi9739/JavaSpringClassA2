package exam07;

public class Ex01 {
    public static void main(String[] args){
        Box<Apple> abox = new Box<Apple>();
        abox.setItem(new Apple());
        //abox.setItem(new Grape());

        Apple apple = abox.getItem();
    }
}
