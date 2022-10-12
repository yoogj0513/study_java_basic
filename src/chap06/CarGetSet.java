package chap06;

public class CarGetSet {

    /**
     * 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 제한
     * 이유는 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨질 수 있기 때문
     *
     * 그래서 메소드를 통해서 데이터를 변경하는 방법 선호
     * 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있기 때문
     * -> 그 메소드가 Setter
     *
     * 외부에서 객체의 데이터를 읽을 때도 메소드 사용
     * -> 그 메소드가 Getter
     *
     * 클래스를 선언할 때 가능하다면 필드를 private로 선언해서 외부로부터 보호
     * 필드에 대한 Setter, Getter 메소드를 작성해서 필드값을 안전하게 변경/사용하는 것이 좋음
     *
     * 필드 타입이 boolean일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이 관례
     *
     * 만약 외부에서 필드값을 읽을 수만 있고 변경하지 못하도록 하려면(읽기 전용) Getter 메소드만 선언, 또는 Setter 메소드를 private 접근제한을 갖도록 선언
     */

    //필드
    private int speed;
    private boolean stop;

    //생성자

    //메소드

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
