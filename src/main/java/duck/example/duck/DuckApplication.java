package duck.example.duck;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DuckApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuckApplication.class, args);
	}

	@Value("${test}")
	private String monk;

	@GetMapping
	public String index()
	{
		return "Hello from Azure and the sad " + monk + " but also VERY VERY happy :D";
	}

}
