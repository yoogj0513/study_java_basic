package chap06;

public class Person {

    /**
     * final 필드
     * 최종적인 필드
     * 초기값이 저장되면 그것이 최종적인 값이 되어 프로그램 실행 도중에 수정 할 수 없다
     *
     * 단순 값일 경우 -> 필드 선언
     *
     * 복잡한 초기화 코드 or 객체 생성 시에 외부 데이터로 초기화 -> 생성자에서 초기값을 지정
     */

    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
