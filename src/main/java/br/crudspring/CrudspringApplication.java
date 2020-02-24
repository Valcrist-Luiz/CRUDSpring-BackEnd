package br.crudspring;

import br.crudspring.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class CrudspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudspringApplication.class, args);
    }

}
