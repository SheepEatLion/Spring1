package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 베이스를 지정해줄 수 있고 basePackageClasses 를 사용하면 그 클래스의 패키지를 기준으로 탐색한다.
        // 디폴트는 @ComponentScan이 붙은 클래스의 패키지로 시작하기 때문에 설정정보클래스를 프젝 최상단에 두는게 관례다.
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
