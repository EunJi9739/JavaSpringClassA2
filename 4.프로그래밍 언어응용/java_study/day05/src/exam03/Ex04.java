package exam03;

import exam02.D;

public class Ex04 {
    public static void main(String[] args){
        Animal human = new Human();
        human.move();

        Animal dog = new Dog();
        dog.move();

        Animal bird= new Bird();
        bird.move();
    }
}
