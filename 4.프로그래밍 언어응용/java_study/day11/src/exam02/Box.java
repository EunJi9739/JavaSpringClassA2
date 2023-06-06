package exam02;

public class Box<T extends Fruit> { //T는 Fruit를 포함한 하위 클래스
    private T item;//Apple
    //private T[] items; //배열은 이렇게 사용 가능 -> 배열 생성시 명확하게 자료형이 있어야 한다.

    public void setItem(T item){//Apple
        this.item = item;
    }

    public T getItem() {//Apple
        return item;
    } //Object

    public void printInfo(){
        item.info();
    }
}
