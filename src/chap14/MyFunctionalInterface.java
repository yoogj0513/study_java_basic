package chap14;

@FunctionalInterface
public interface MyFunctionalInterface {
    /**
     * 함수적 인터페이스(@FunctionInterface)
     * 모든 인터페이스를 람다식 타켓 타입으로 사용할 수 없음
     * 람다식이 하나의 메소드를 정의하기 때문에 두 개 이상의 추상 메소드가 선언된 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다
     * 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타켓 타입이 될 수 있음
     * 그 인터페이스가 함수적 인터페이스임
     *
     * 어노테이션을 붙이면 두 개 이상의 추상 메소드가 선언되지 않도록 컴파일러가 체킹해줌
     */

    public void method();
}
