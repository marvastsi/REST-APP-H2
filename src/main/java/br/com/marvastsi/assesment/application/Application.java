package br.com.marvastsi.assesment.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "br.com.marvastsi.assesment.controller", "br.com.marvastsi.assesment.service",
		"br.com.marvastsi.assesment.repository" })
@EnableJpaRepositories({ "br.com.marvastsi.assesment.repository" })
@EntityScan({ "br.com.marvastsi.assesment.model" })
public class Application {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
}
