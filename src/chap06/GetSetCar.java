package chap06;

public class GetSetCar {
    /**
     * 클래스를 선언할 때 가능하다면 필드는 private로 선언해서 외부로부터 보호하고,
     * 필드에 대한 Setter, Getter 메소드를 작성해서 필드값을 안전하게 변경/사용하는 것이 좋음
     */

    // 필드
    private int speed;
    private boolean stop;

    /**
     * Getter, Setter 메소드
     * 일반적으로 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막음
     * 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨질수 있기 때문
     * 이러한 문제점 해결하기 위해 객체 지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호
     */

    /**
     * Getter 메소드
     * 외부에서 객체의 데이터를 읽을 때 메소드를 사용
     * 객체 외부에서 객체의 필드값을 사용하기에 부적절할 경우도 있기때문에
     * 메소드로 가공한 후 외부로 전달 -> 그 역할을 하는 메소드 Getter
     *
     * 메소드 선언 방법
     * 접근제한자 : public
     * 리턴 타입 : 필드타입
     * 메소드 이름 : get+필드이름
     * 리턴값 : 필드값
     */
    public int getSpeed() {
        //double km = speed *   //-> 필드값인 마일을 km 단위로 환산 후 외부로 리턴
        return speed;
    }

    /**
     * Setter 메소드
     * 데이터는 외부에서 접근할 수 없도록 막고
     * 메소드는 공개해서 외부에서 메소드를 통해 데이터에 접근하도록 유도
     * -> 이유 : 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있기 때문
     *          그 역할을 하는 메소드는 Setter
     *
     * 메소드 선언 방법
     * 접근제한자 : public
     * 리턴타입 : void
     * 메소드 이름 : set+필드이름
     * 매개 변수 타임 : 필드타입
     */
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }


    /**
     * 필드 타입이 boolean일 경우에는
     * Getter get -> is
     */
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }

}
