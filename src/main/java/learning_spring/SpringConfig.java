package learning_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("learning_spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
