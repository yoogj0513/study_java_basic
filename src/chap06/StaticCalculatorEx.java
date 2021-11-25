package chap06;

public class StaticCalculatorEx {
    public static void main(String[] args) {
        double result1 = 10 * 10 * StaticCalculator.pi;
        int result2 = StaticCalculator.plus(10, 5);
        int result3 = StaticCalculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result : " + result3);
    }
}
