package br.com.rtarcisio.course;

import br.com.rtarcisio.core.repository.CourseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("br.com.rtarcisio")
@EntityScan({"br.com.rtarcisio.core.model"})
@EnableJpaRepositories(basePackageClasses = CourseRepository.class)

public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}
