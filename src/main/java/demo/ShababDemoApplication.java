package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by sanjidagafur on 10/09/2015.
 */
@EnableJpaRepositories("demo.repositories")
@EntityScan(basePackages = "demo.domain")
@SpringBootApplication
public class ShababDemoApplication extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ShababDemoApplication.class, args);
    }

}
