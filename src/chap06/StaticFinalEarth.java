package chap06;

public class StaticFinalEarth {
    /**
     * 상수 (static final)
     * 불변의 값을 저장하는 필드
     *
     * final 필드는 한 번 초기화되면 수정할 수 없는 필드이지만 상수는 아님
     * 불변의 값은 객체마다 저장할 필요가 없는 공정성을 띠고, 여러 가지 값으로 초기화될 수 없기 때문
     *
     * static final 필드는 객체마다 저장되지 않고, 클래스에만 포함
     * 한 번 초기값이 저장되면 변경할 수 없다.
     * 초기값이 단순 값이라면 선언 시에 주는 것이 일반적
     * 복잡한 초기화일 경우 정적 블럭에서도 할 수 있음
     *
     * 상수 이름은 모두 대문자로 작성하는 것이 관례
     */

    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static  {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
