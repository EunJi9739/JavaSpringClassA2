package exam03;

public class Ex01 {
    public static void main(String[] args){
        LoginService service = new LoginService();
        service.login("user", "1235");
        System.out.println("실행코드!");
    }
}
