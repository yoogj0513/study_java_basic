package chap06;

public class StudentExample {
    public static void main(String[] args) {
        /**
         * 클래스의 용도
         * 1. 라이브러리(API:Application Program Interface)용
         * 2. 실행용
         *    : 프로그램 실행 진입점인 main() 메소드를 제공하는 역할
         *
         * 프로그램 전체에서 사용되는 클래스가 100개라면 99개는 라이브러리이고
         * 단 하나가 실행 클래스이다.
         *
         * 대부분의 객체 지향 프로그램은 라이브러리(부품 객체 및 완성 객체)와 실행 클래스가 분리
         */

        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
