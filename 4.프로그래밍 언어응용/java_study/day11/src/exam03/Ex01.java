package exam03;

public class Ex01 {
    public static void main(String[] args){
        Box<Apple> apples = new Box<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());

        Jucier.make(apples);

        Box<Grape> grapes = new Box<>();
        grapes.add(new Grape());
        grapes.add(new Grape());
        grapes.add(new Grape());

        Jucier.make(grapes);

        /*
        //하한 제한?
        Box<String> strings = new Box<>();
        strings.add("장난감1");
        strings.add("장난감2");
        strings.add("장난감3");

        Jucier.make(strings);

         */

    }
}
