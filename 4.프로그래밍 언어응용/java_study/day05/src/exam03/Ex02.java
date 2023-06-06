package exam03;

public class Ex02 {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];

        animals[0] = new Human(); //Animal animals[0] = new Human(); //다형성때문에 가능
        animals[1] = new Dog(); //Animal animals[1] = new Dog();
        animals[2] = new Bird(); //Animal animals[2] = new Bird();

        for(Animal animal : animals){
            animal.move();
        }

    }
}
