package br.com.fiap.befic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BeficApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeficApplication.class, args);
    }
}
