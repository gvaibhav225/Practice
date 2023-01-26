package spring02annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfiguration {

	@Bean
	public user user() {
		return new user();
	}
	
}
