package in.cg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("in.cg")
@PropertySource("classpath:db.properties")
public class AppConfig {

}
