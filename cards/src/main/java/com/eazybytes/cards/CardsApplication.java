package com.eazybytes.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "EazyBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Saurav Kumar", 
						email = "sauravkumar09071996@gmail.com", 
						url = "https://tipsontech.medium.com"
				),
				license = @License(
						name="Apache 2.0",
						url="https://tipsontech.medium.com"
				)
				
		),
		externalDocs = @ExternalDocumentation(
					description = "EazyBank Accounts microservice REST API Documentation",
					url="https://tipsontech.medium.com"
				)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
