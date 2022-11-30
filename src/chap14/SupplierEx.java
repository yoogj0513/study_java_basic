package chap14;

import java.util.function.IntSupplier;

public class SupplierEx {
    /**
     * Supplier 함수적 인터페이스
     * 매개 변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고 있음
     * 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할
     */

    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("눈의 수 : " + num);
    }
}
