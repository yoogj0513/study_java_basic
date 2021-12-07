package chap06;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
    public static void main(String[] args) {
        //Service 클래스로부터 메소드 정보를 얻음
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        //Method 객체를 하나씩 처리
        for(Method method : declaredMethods) {
            //PrintAnnotation이 적용되었는지 확인
            if (method.isAnnotationPresent(PrintAnnoation.class)) {
                //PrintAnnotation 객체 얻기
                PrintAnnoation printAnnoation = method.getAnnotation(PrintAnnoation.class);

                //메소드 이름 출력
                System.out.println("[" + method.getName() + "]");

                //구분선 출력
                for (int i = 0; i < printAnnoation.number(); i++) {
                    System.out.print(printAnnoation.value());
                }

                System.out.println();

                try {
                    //메소드 호출
                    method.invoke(new Service());
                } catch (Exception e) {

                }

                System.out.println();
            }
        }
    }
}
