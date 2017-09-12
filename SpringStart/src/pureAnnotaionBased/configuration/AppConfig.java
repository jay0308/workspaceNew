package pureAnnotaionBased.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public SamsungPhone getPhone() {
		return new SamsungPhone();
	}
	
	@Bean
	public SamsungProcessor getProcessor() {
		return new SamsungProcessor();
	}
}
