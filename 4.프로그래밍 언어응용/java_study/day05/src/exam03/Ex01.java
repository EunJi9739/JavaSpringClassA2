package exam03;

import exam02.D;

public class Ex01 {
    public static void main(String[] args){
        Animal human = new Human();
        human.move();

        Animal dog = new Dog(); //다형성 때문에 가능
        dog.move();

        Animal bird = new Bird();
        bird.move();

    }
}
