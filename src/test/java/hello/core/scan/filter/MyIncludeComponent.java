package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)// 타입이면 클래스 레벨
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {

}
