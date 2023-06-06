package exam02;

public class Ex04 {
    public static void main(String[] args){
        C c = new C();
        A ac = new C();

        //D d = new D();
        A ad = new D();

        if(ad instanceof C) {
            C c1 = (C) ad;
        }

        System.out.println(ac instanceof A);
        System.out.println(ac instanceof B);
        System.out.println(ac instanceof C);
    }
}
