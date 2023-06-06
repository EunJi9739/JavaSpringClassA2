package exam01;

public class Company {
    private static Company instance; //= new Company(); //내부에서는 생성 가능
    private Company() {} //통제가 안되니 이렇게 해야함.

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }
}
