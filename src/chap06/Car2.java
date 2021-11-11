package chap06;

public class Car2 {
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    /**
     * 다른 생성자 호출(this)
     * 생성자 오버로딩이 많아질 경우 생성자간의 중복된 코드 발생 가능성 있음
     * 매개 변수의 수만 달리하고 필드 초기화 내용이 비슷한 생성자에서 이러한 현상을 많이 보임
     * -> 필드 초기화 내용은 한 생성자에만 집중적으로 작성하고 나버지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선
     *
     * this() 코드 사용
     * - this()는 자신의 다른 생성자를 호출하는 코드
     * - 반드시 생성자의 첫줄에만 허용
     * - this()의 매가밧은 호출되는 생성자의 매개 변수 타입에 맞게 제공
     * - this() 다음에는 추가적인 실행문들이 올 수 있음
     *      -> 호출되는 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음 실행문을 진행한다는 뜻
     *
     *  [중복 예시]
     *      Car2(String model) {
     *         this.model = model;
     *         this.color = "은색";
     *         this.maxSpeed = 250;
     *     }
     *
     *     Car2(String model, String color) {
     *         this.model = model;
     *         this.color = color;
     *         this.maxSpeed = 250;
     *     }
     *
     *     Car2(String model, String color, int maxSpeed) {
     *         this.model = model;
     *         this.color = color;
     *         this.maxSpeed = maxSpeed;
     *     }
     */


    //생성자
    Car2(){}

    Car2(String model) {
        this(model, "은색",250);              //호축
    }

    Car2(String model, String color) {
        this(model, color, 250);    //호출
    }

    Car2(String model, String color, int maxSpeed) {
        // 공통 실행 코드
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
