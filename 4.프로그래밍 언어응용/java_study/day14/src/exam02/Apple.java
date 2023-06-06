package exam02;

public class Apple extends Fruit{
    private int price;

    public Apple(int price){
        this.price = price;
    }

    public String toString(){
        return "사과 : "+price;
    }

    /*
    //기준 추가?
    @Override
    public int compareTo(Apple o) {
        return price - o.price; //오름차순
    }

     */
}
