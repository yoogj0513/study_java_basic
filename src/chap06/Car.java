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

    /**
     * 생성자
     * new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당
     * 객체 초기화 : 필드 초기화, 메서드를 호출해 객체를 사용할 준비를 하는 것
     * 모든 클래스에는 생성자가 반드시 존재, 하나 이상을 가질 수 있음
     * 생략했다면 컴파일러는 기본 생성자를 바이트 코드에 자동 추가 ex) [public] 클래스() { }
     * 선언한 생성자가 한 개라도 있으면, 컴파일러는 기본 생성자를 추가하지 않음
     *
     * 생성자 선언
     * 메소드와 비슷한 모양을 가짐
     * 리턴 타입이 없고, 클래스 이름과 동일
     * 블록 내부에는 객체 초기화 코드가 작성
     */
    //기본 생성자
    Car() { }

    // 생성자
    Car(String color, int cc) { }

    /**
     * 생성자 오버로딩(Overloading)
     * 생성자가 하나뿐이라면 여러 요구 조건을 수용할 수 없음
     * (여러 조건 예시 : Car 객체를 생성할 때 외부에서 제공하는 데이터가 없다면 기본 생성자로
     *                외부에서 model 데이터가 제공되거나 model과 color가 제공될 경우에도 Car 객체를 생성할 수 있어야 함)
     * 자바에서는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩 제공
     * 생성자 오버로딩 : 매개 변수를 달리하는 생성자를 여러 개 선언하는 것
     *               매개 변수의 타입, 개수, 순서가 다르게 선언
     */
    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
