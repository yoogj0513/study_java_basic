package chap06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int plus = myCal.plus(5, 6);
        System.out.println("plus : " + plus);

        byte x = 10;
        byte y = 4;
        double divide = myCal.divide(x, y);
        System.out.println("divide : " + divide);

        myCal.powerOff();

        myCal.execute(); //메소드 호출
    }
}
