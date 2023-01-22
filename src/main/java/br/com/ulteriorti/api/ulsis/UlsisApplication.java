package br.com.ulteriorti.api.ulsis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableJpaRepositories("br.com.ulteriorti.api.ulsis.repositories")
@ComponentScan({"br.com.ulteriorti.api.ulsis.*" })
@SpringBootApplication
@RestController
public class UlsisApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlsisApplication.class, args);


	}
	@GetMapping("/")
	public String index(){
		return "Ulsis v1.0 beta!";
	}

}
