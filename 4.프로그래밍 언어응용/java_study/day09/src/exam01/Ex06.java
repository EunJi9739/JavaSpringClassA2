package exam01;

public class Ex06 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(1000);
        /*
        StringBuffer sb2 = sb.append("abc");
        StringBuffer sb3 = sb2.append("def");
        StringBuffer sb4 = sb3.append("ghi");

         */
        sb.append("abc").append("def").append("ghi");
        //메서드 체이닝


        sb.append("jkl");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
