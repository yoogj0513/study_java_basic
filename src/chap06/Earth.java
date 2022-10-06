package chap06;

public class Earth {
    /**
     * 상수
     * 불변의 값
     *
     * final : 한 번 초기화되면 수정할 수 없는 필드
     *          객체마다 저장, 생성자의 매개값을 통해서 여러 가지 값을 가질 수 있음
     *          그래서 상수라고 부르진 않음
     *          불변의 값은 객체마다 저장할 필요가 없는 공용성을 띠고 있으며, 여러 가지 값으로 초기화 될 수 없기 때문
     *
     * 상수 : static 이면서 final 이어야 함
     *      static final 필드는 객체마다 저장되지 않고, 클래스에만 포함
     *      한 번 초기값이 저장되면 변경할 수 없다.
     */

    static final double EARTH_RQDIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RQDIUS * EARTH_RQDIUS;
    }
    
    /*
        Math.PI : 자바에서 제공하는 상수
     */
}
