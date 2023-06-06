package exam02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ex14 {
    public static void main(String[] args){
        List<Apple> apples = IntStream.range(0, 10)
                .mapToObj(n -> new Apple(1000 * (int)(Math.random()*n))).toList();

        Comparator<Fruit> appleComp = (a, b) -> b.compareTo(a); //내림차순

        List<Apple> apples2 = apples.stream().sorted(appleComp).toList(); //Apple, Fruit, Object
                                                    //Comparator<Apple>, Comparator<Fruit> ...
        for(Apple apple : apples2){
            System.out.println(apple);
        }

        System.out.println("--------------------");

        //멜론
        List<Melon> melons = IntStream.range(0, 10)
                .mapToObj(n -> new Melon(1000 * (int)(Math.random()*n))).toList();

        List<Melon> melons2 = melons.stream().sorted(appleComp).toList(); //Melon, Fruit, Object
                                                    //Comparator<Melon>, Comparator<Fruit>
        for(Melon melon : melons2){
            System.out.println(melon);
        }
    }
}
