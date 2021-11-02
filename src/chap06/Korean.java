package chap06;

public class Korean {
    /**
     * 생성자에서 필드 초기화
     */

    //필드
    String nation = "대한민국";
    String name;
    String ssn;

    /**
     * 매개 변수의 이름은 필드 초기화시킬 필드 이름과 비슷하거나 동일한 이름을 사용
     * 필드와 매개변수 이름이 동일할 경우 생성자 내부에서 해당 필드를 접근할 수 없음
     * 동일한 이름의 매개 변수가 사용 우선순위가 높기 때문
     * 필드 앞에 'this.'를 붙임
     * this : 객체 자신의 참조
     * 참조 변수로 필드를 사용하는 것과 동일
     *
     * @param name
     * @param ssn
     */
    //생성자
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn  = ssn;
    }
}
