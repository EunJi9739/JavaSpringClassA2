package exam01;

import java.util.stream.StreamSupport;

public class Ex02 {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str1 == str2 : "+(str1 == str2)); //동일성 비교 false
        System.out.println("str1.hashCode : "+str1.hashCode());
        System.out.println("str2.hashCode : "+str2.hashCode());
        System.out.println("str1.equals(str2) : "+str1.equals(str2)); //동등성 true
    }
}
