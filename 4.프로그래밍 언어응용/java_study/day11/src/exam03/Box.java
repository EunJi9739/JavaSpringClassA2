package exam03;

import java.util.ArrayList;
import java.util.List;

public class Box<T> { //지네릭 클래스 -> T는 인스턴스가 생성될 때 결정
    //private static T staticItem; -> 사용 불가
    //공간이 처음부터 정해지고, 알려져서..
    //static..
    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}
