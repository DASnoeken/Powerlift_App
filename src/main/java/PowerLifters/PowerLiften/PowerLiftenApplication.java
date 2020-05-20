package PowerLifters.PowerLiften;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PowerLiftenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerLiftenApplication.class, args);
	}
}
