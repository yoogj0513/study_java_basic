package chap14;

public class UsingThis {
    /**
     * 클래스 멤버(필드와 메소드) 사용
     * 람다식 실행 블록에는 클래스의 멤버와 필드와 메소드를 제약 사항 없이 사용 가능
     * 하지만 this 키워드를 사용할 때는 주의가 필요
     * 람다식에서는 this는 내부적으로 생성되는 익명 객체의 참조가 아니라 람다식을 실행한 객체의 참조
     *
     * 바깥 객체와 중첩 객체의 참조를 얻어 필드값을 출력하는 방법 예제
     * 중법 객체 Inner에서 람다식을 실행했기 때문에 람다식 내부에서의 this는 중첩 객체 Inner이다.
     */

    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            //람다식
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterField : " + UsingThis.this.outterField + "\n"); //바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField + "\n");//람다식 내부에서 this는 Inner 객체를 참조
            };
            fi.method();
        }
    }
}
