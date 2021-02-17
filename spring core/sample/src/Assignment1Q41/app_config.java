package Assignment1Q41;

import org.springframework.context.annotation.Bean;

public class app_config {

	@Bean
	public states getstate()
	{
		return new states();
	}
}
