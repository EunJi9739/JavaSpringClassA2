package exam03;

import java.util.List;

public class Jucier {
/*
    public static void make(Box<?> fruits){ // ? -> 메서드가 호출 될 때 결정
        List<?> itmes = fruits.getItems();
        System.out.println(itmes);
    }

*/

    public static void make(Box<? extends Fruit> fruits){
        List<?> items = fruits.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(Box<T> fruits, Box<T> fruits2, Box<T> fruits3){
        List<T> items = fruits.getItems();
        System.out.println(items);
    }

    public static void make2(Box<? super Apple> fruits){ //Apple을 포함한 상위 클래스로 제한
        List<?> items = fruits.getItems();
        System.out.println(items);
    }




}
