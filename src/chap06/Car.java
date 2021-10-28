package chap06;

public class Car {
    /**
     * 필드
     * 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳
     * 생성자 선언과 메소드 선언의 앞, 뒤 어떤 곳에서도 필드 선언이 가능
     * 하지만 생성자, 메소드 중괄호 블록 내부에서는 선언될 수 없다. -> 로컬 변수가 되기 때문
     *
     * 필드 사용
     * 필드값을 읽고, 변경하는 작업
     * 내부에서 사용할 경우 : 단순 필드 이름을 읽고 변경
     * 외부 클래서에서 사용 : 객체 생성 > 필드 사용
     */

    String company  = "현대자동차";
    String model    = "그랜저";
    String color    = "검정";
    int maxSpeed    = 350;
    int speed;
}
