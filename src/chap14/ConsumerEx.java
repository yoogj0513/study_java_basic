package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
    /**
     * Consumer 함수적 인터페이스
     * 리턴값이 없는 accept() 메소드를 가지고 있음
     * accep() 메소드는 단지 매개값을 소비하는 역할 (리턴값이 없다는 뜻)
     */

    public static void main(String[] args) {
        /**
         * Consumer<T> 인터페이스를 타겟 타입
         * accept()메소드는 매개값으로 T 객체 하나를 가지므로 람다식도 한 개의 매개 변수를 사용
         * 타입 파라미터 T에 String이 대입되었기 때문에 람다식의 t 매개 변수 타입은 String이 됨
         */
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("java");

        /**
         * BiConsumer<T, U> 인터페이스를 타켓 타입
         * accept()메소드는 매개값으로 T와 U 두 개의 객체를 가지므로 람다식도 두 개의 매개 변수를 사용
         * 타입 파라미터 T와 U에 String이 대입되었기 때문에 람다식의 t와 u 매개 변수 타입은 각각 String이 됨
         */
        BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
        bigConsumer.accept("Java", "8");

        /**
         * DoubleConsumer 인터페이스를 타켓 타임
         * accept()메소드는 매개값으로 double 하나를 가지므로 람다식도 한 개의 매개 변수를 사용
         * d는 고정적으로 double 타입이 됨
         */
        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
        doubleConsumer.accept(8.0);

        /**
         * ObjIntConsumer<T> 인터페이스를 타켓 타입
         * accept()메소드는 매개값으로 T 객체와 int 값 두 개를 가지기 때문에 람다식도 두 개의 매개 변수 사용
         * T가 String 타입이므로 람다식의 t 매개 변수 타입은 String이 되고, i는 고정적으로 int 타입이 됨
         */
        ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
        objIntConsumer.accept("Java", 8);일
    }
}
