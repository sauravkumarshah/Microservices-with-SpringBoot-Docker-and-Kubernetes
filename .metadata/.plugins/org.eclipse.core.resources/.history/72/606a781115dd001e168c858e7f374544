package com.eazybytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices REST API Documentation", 
				description = "EazyBank Accounts microservices REST API Documentation", 
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
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
