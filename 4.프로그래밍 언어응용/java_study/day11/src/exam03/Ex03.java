package exam03;

public class Ex03 {
    public static void main(String[] args){
        Box<Fruit> grapes = new Box<>();
        grapes.add(new Grape());
        grapes.add(new Grape());
        grapes.add(new Grape());

        //Jucier.make2(grapes); //Apple, Fruit, Object
    }
}
