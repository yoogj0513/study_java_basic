package chap14;

public class MyFunctionalInterFaceEx {
    /**
     * 람다식
     * 익명 함수(anonymous Function)를 생성하기 위한 식
     * 객체 지향 언어보단 함수 지향 언어에 가깝
     *
     * 람다식 -> 매개 변수를 가진 코드 블록 -> 익명 구현 객체
     * "(매개변수)->{실행코드}" 형태
     *
     * 기본 문법
     * (타입 매개변수, ...)->{실행문; ...}
     * (int a) -> {System.out.println(a);}
     *
     * 매개 변수 타입은 런타임 시에 대입되는 값에 따라 자동으로 인식
     * 람다식에서는 타입을 일반적으로 언급하지 않음
     * (a)->{System.out.println(a);}
     *
     * return문으로 결과값 지정가능
     * (x, y) -> { return x + y; };
     * (x, y) -> x + y;
     */

    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();

        System.out.println("=============================");

        /**
         * 매개 변수가 있는 람다식
         */
        MyFunctionalInterFace2 fi2;

        fi2 = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi2.method(2);

        fi2 = x -> {
            System.out.println(x*5);
        };
        fi2.method(2);

        System.out.println("=============================");

        /**
         * 리턴값이 있는 람다식
         */
        MyFunctionalInterface3 fi3;

        fi3 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi3.method(2, 5));

        fi3 = (x, y) -> {return x + y;};
        System.out.println(fi3.method(2, 5));

        fi3 = (x, y) -> x + y;
        System.out.println(fi3.method(2, 5));

        fi3 = (x, y) -> sum(x, y);
        System.out.println(fi3.method(2, 5));

    }

    public static int sum(int x, int y) {
        return (x + y);
    }
}
