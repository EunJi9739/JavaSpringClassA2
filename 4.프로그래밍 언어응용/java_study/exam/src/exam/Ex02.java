package exam;

public class Ex02 {
    public static void main(String[] args){
        double m = 20.0;
        double angle = 60.0;
        double height = 1.5;

        double resultHeight = m * Math.tan(Math.toRadians(angle))+height;

        System.out.printf("건물의 높이 : %.2fm%n",resultHeight);
    }
}
