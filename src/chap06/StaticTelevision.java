package chap06;

public class StaticTelevision {
    /**
     * 정적 초기화 블록
     * 정적 블록
     * : 정적 필드의 복잡한 초기화 작업을 위해 자바에서 제공
     * 클래스가 메모리로 로딩될 때 선언된 순서대로 자동으로 실행됨
     */

    static String company = "Sansung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
