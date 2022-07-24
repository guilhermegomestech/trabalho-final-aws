package br.com.cbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EntityScan(basePackages = { "br.com.cbf.model" })
//@ComponentScan(basePackages = "br.com.cbf.repository")
//@EnableJpaRepositories("br.com.cbf.repository")
public class CbfApplication{

	public static void main(String[] args) {
		SpringApplication.run(CbfApplication.class, args);
	}

}
