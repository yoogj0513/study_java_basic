package chap06;

public class Calculator {
    /**
     * 메소드
     * 객체의 동작에 해당하는 중괄호 블록
     * 필드를 읽고 수정하는 역할도 하고, 다른 객체를 생성해서 다양한 기능을 수행하기도 함
     * 객체 간의 데이터를 전달하는 수단으로 사용
     * 외부로부터 매개값을 받을 수 있고, 실행 후 어떤 값을 리턴할 수도 있음
     *
     * 메소드 선언
     * 리턴타입 메소드이름([매개변수 선언, ...]) {
     *     실행할 코드를 작성하는 곳
     * }
     *
     * 리턴값이 있을 수도 없을 수도 있음
     * 실행 후 결과를 호출할 곳에 넘겨줄 경우 리턴값이 있어야 함
     *
     * 메소드 이름
     * 메소드가 어떤 기능을 수행하는지 쉽게 알 수 있도록 기능 이름을 지어주는 것이 좋다.
     * 예) run(), startEngine(), getName(), getScores()
     */

    //메소드
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    /**
     * 클래스 내부에서 메소드 호출
     */
    double avg(int x, int y) {
        double sum = plus(x, y); //메소드 호출
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7, 10); //메소드 호출
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }

    /**
     * 메소드 오버로딩
     * 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
     * 조건 : 매개 변수의 타입, 개수, 순서 중 하나가 달라야 함
     * 필요성 : 매개값을 다양하게 받아 처리할 수 있도록 하기 위해서
     */
    //정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    //직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
