package exam08;

public class Ex02 {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Calculator cal = out.method(5);
        int result = cal.add(10, 20); // 10 + 20 + 5
        System.out.println(result);

        int result2 = cal.add(20, 30); // 20 + 30 + 5
        System.out.println(result2);
    }
}
