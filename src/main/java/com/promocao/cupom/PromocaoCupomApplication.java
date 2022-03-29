package com.promocao.cupom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class PromocaoCupomApplication {

	private static final Logger log = LoggerFactory.getLogger(PromocaoCupomApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PromocaoCupomApplication.class, args);
		ConfigurableEnvironment environment = run.getEnvironment();

		log.info("\n\n\t---------------------------------\n\t" +
				":: Cadastro de cupom na porta :: " + environment.getProperty("server.port") + " ::" +
				"\n\t------------------------------------\n\t");
	}
}
