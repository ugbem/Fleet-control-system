package com.etek.fleetsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class FleetSystemApplication {

    //@Bean //	public AuditorAware<String> auditorAware() {
//		return new SpringSecurityAuditorAware();
//	}

    public static void main(String[] args) {
		SpringApplication.run(FleetSystemApplication.class, args);
	}

}
