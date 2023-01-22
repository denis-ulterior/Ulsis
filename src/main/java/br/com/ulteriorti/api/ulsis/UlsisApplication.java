package br.com.ulteriorti.api.ulsis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
