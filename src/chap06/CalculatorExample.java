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

        /**
         * 메소드 오버로딩
         */
        //정사각형의 넓이 구하기
        double return1 = myCal.areaRectangle(10);

        //직사각형의 넓이 구하기
        double return2 = myCal.areaRectangle(10, 20);

        //결과 출력
        System.out.println("정사각형의 넓이 : " + return1);
        System.out.println("직사각형의 넓이 : " + return2);
    }
}
