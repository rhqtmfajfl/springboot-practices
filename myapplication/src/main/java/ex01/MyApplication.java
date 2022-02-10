package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyApplication {
	
	@Bean
	public MyComponent myComponent() {
		
		return new MyComponent();
	}

	public static void main(String[] args) {

		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {		// HelloworldApplication는 설정 파일잉다 3 번을 하려고

			
		}
		
	}

}
