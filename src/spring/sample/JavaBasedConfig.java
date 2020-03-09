package spring.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaBasedConfig {

	@Bean
	public MedicalService firstAidMedicalService() {
		return new FirstAidMedicalService();
	}

	@Bean
	public MedicalService firstAidForBasketBall() {
		return new FirstAidForBasketBall();
	}

	@Bean
	public Cricket cricket() {
		return new Cricket(firstAidMedicalService(), "CSK");
	}

	@Bean
	@Scope("prototype")
	public BasketBall basketBall() {
		BasketBall basketball = new BasketBall();
		basketball.setMedicalService(firstAidForBasketBall());
		return basketball;
	}
}
