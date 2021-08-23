package springIntroduction.javaCode.realizationComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springIntroduction.javaCode.realizationComponentScan")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
}
