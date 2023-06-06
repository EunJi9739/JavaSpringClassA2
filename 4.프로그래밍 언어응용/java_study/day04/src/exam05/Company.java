package exam05;

public class Company {
    private static Company instance;
    //static이 없으면
    private Company(){}

    public static Company getInstance(){
        if (instance==null){
            instance = new Company();
            //메모리 낭비를 줄이기 위해.
        }
        return instance;
    }
}
