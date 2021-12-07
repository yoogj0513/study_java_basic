package chap06;

public class Service {
    @PrintAnnoation                             // 기본값 적용
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnoation("*")                        // value값을 "*"로 설정
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnoation(value = "#", number = 20)   // value 값을 "#", number 값을 20으로 설정
    public void method3() {
        System.out.println("실행 내용3");
    }
}
