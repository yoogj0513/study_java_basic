package chap07;

public class CellPhone {
    /**
     * 상속
     * 이미 잘 개빌된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 코드의 중복을 줄여준다
     *
     * 상속을 해도 부모 클래스의 모든 필드와 메소드들을 물려받는 것은 아님
     * private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외
     * 부모 클래스와 자식 클래스가 다른 패키지에 존재한다면 default 접근 제한을 갖는 필드와 메소드도 상속 제외
     */

    //필드
    String model;
    String color;

    //생성자

    //메소드
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void bell() {
        System.out.println("벨이 울립니다.");
    }

    void sendVoice(String message) {
        System.out.println("본인 : " + message);
    }

    void receiveVoice(String message) {
        System.out.println("상대방 : " + message);
    }

    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
