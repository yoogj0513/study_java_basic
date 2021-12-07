package chap06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 어노테이션 간단 예제
 * 각 메소드의 실행 내용을 구분선을 분리해서 콘솔에 출력하도록 하는 PrintAnnotation
 * @Target은 메소드에만 적용
 * @Retention은 런타임 시까지 어노테이션 정보 유지
 * 기본 엘리먼트 value는 구분선에 사용될 문자
 * number은 반복 출력 횟수
 * 각 디폴트 값은 "-"와 15를 줌
 *
 * PrintAnnotation을 적용한 곳은 Service 클래스
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnoation {
    String value() default  "-";
    int number() default 15;
}

