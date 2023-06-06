package exam01;

public class Ex04 {
    public static void main(String[] args){
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("== : "+(s1 == s2));
        System.out.println("s1 : "+System.identityHashCode(s1));
        System.out.println("s2 : "+System.identityHashCode(s2));

        System.out.println("equals : "+s1.equals(s2));
    }
}
