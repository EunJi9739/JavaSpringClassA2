package exam02;

public class Ex01 {
    public static void main(String[] args){
        Box<Apple> abox = new Box<Apple>();

        //abox.setItem(new Grape()); //타입안정성으로 인해 X
        abox.setItem(new Apple());
        Apple apple = abox.getItem();

        abox.printInfo();
        //Apple apple = abox.getItem();

        Box<Grape> gbox = new Box<Grape>();
    }
}
