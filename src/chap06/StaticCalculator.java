package chap06;

public class StaticCalculator {
    /**
     * 정적(static) 멤버
     * 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드 (정적필드, 정적메소드)
     * 정적 멤버는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 한다.
     *
     * 정적 멤버 선언
     * 정적 필드
     * static 타입 필드 [=  초기값];
     *
     * 정적 메소드
     * static 리턴 타입 메소드(매개변수선언, ... ){...}
     *
     * 필드 선언 판단 기준
     * 객체마다 가지고 있어야 할 데이터 -> 인스턴스 필드 선언
     * 객체마다 가지고 있을 필요성이 없는 공용적인 데이터 -> 정적 필드
     * 예) 원의 넓이나 둘레를 구할 때 필요한 파이는 객체마다 가지고 있을 필요가 없는 변하지 않는 공용적인 데이터이므로 정적 필드로 선언
     * 그러나 객체별로 색깔이 다르다면 색깔은 인스턴스 필드로 선언
     *
     * 메소드 선언 판단 기준
     * 인스턴스 필드를 이용해서 실행해야 한다면 -> 인스턴스 메소드
     * 인스턴스 필드를 이용하지 않는다면 -> 정적 메소드
     *
     * 정적 멤버 사용
     * 클래스.필드;
     * 클래스.메소드(매개값, ...);
     */

    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
