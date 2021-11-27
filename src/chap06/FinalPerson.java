package chap06;

public class FinalPerson {
    /**
     * final필드
     * 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행도중에 수정할 수 없다는 것
     * <p>
     * final 선언
     * final 타입 필드 [= 초기값];
     * <p>
     * final필드의 초기값 설정 방법
     * 1. 필드 선언 시
     * - 단순값이라면 필드 선언
     * 2. 생성자에서 설정
     * - 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부 데이터로 초기화해야할때
     * - 생성자 final 필드의 최종 초기화를 마쳐야 하는데, 만약 초기화되지 않는 final 필드를 그대로 남겨두면 컴파일 에러 발생
     */

    final String nation = "Korea";
    final String ssn;
    String name;

    public FinalPerson(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
