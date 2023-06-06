package exam06;

public class ResourceEx implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("자원 해제!");
    }
}
