package exam02;

public class Melon extends Fruit{
    private int price;

    public Melon(int price){
        this.price = price;
    }

    public String toString(){
        return "멜론 : "+price;
    }

    /*
    //기준 추가?
    @Override
    public int compareTo(Melon o) {
        return price - o.price; //오름차순
    }

     */

}
