package exam06;

public class Ex02 {
    public static void main(String[] args){
        try(ResourceEx ex = new ResourceEx()){

            //1. ex instanceof AutoCloseable
            //2. close()
        }catch (Exception e){}
    }
}
