package chap06;

public class Computer {
    /**
     * 매개 변수의 수를 모를 경우
     * 메소드의 매개 변수는 개수가 이미 정해져 있는 것이 일반적
     * 경우에 따라 메소드를 선언할 때 매개 변수의 개수를 알 수 없는 경우가 있음
     * 해결책은 배열 타입으로 선언하는 것
     * 배열 타입으로 선언하면 메소드를 호출하기 전에 배열을 생성해야 하는 불편한 점이 있어
     * 배열을 생성하지 않고 값의 리스트만 넘겨주는 방법도 있음
     * 메소드의 매개변수를 '...'를 사용해서 선언하게 되면 메소드 호출 시 넘겨중 값의 수에 따라 자동으로 배열 생성되고 값을 사용
     */

    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
