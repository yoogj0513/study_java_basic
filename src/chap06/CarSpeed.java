package chap06;

public class CarSpeed {
    /**
     * 객체 외부에서 호출
     * 외부 클래스에서 메소드를 호출하려면 객체를 생성해야함
     * 메소드는 객체에 소속된 멤버이므로 객체가 존재하지 않으면 메소드도 존재하지 않기 때문
     *
     * 클래스 참조변수 = new 클래스(매개값, ... );
     *
     * 객체가 생성되면 참조 변수와 함께 도트(.) 연산자를 사용해서 메소드를 호출할 수 있음
     * 도트연산자 : 객체 접근 연산자. 객체가 가지고 있는 필드나 메소드에 접근할 때 사용
     *
     * 참조변수.메소드(매개값, ...);
     * 타입 변수 = 참조변수.메소드(매개값, ...);
     */

    //필드
    int speed;

    //생성자

    //메소드
    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 0; i <= 50; i += 10) {
            speed = i;
            System.out.println("시속 : " + speed + "km/h");
        }
    }
}
