package br.edu.infnet.appAula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppAulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAulaApplication.class, args);
	}

}
