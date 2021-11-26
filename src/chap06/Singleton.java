package chap06;

public class Singleton {
    /**
     * 싱글톤
     * 단 하나만 생성된 객체
     * 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 함 -> 접근 제한 private로 설정
     * 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화
     * 정적 필드도 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 막는다
     * 대신 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적 필드에서 참조하고있는 자신의 객체를 리턴
     *
     * 외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 방법
     */

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}
