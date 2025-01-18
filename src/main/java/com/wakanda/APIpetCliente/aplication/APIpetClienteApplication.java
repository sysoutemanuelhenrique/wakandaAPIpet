package com.wakanda.APIpetCliente.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping ("/")
@SpringBootApplication(scanBasePackages = "com.wakanda.APIpetCliente.aplication")
@EnableJpaRepositories(basePackages = " com.wakanda.APIpetCliente.aplication.infra;")
@EntityScan(basePackages = "com.wakanda.APIpetCliente.aplication.service.Clienten")
public class APIpetClienteApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return  "Cliente Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(APIpetClienteApplication.class, args);
	}

}
