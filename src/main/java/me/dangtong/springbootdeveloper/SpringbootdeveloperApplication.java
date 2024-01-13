package me.dangtong.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootdeveloperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdeveloperApplication.class, args);
    }

}
