package us.com.convertirdollars.Convertirdollar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.com.convertirdollars.Convertirdollar.service.ConsoumirApi;

@SpringBootApplication
public class ConvertirdollarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConvertirdollarApplication.class, args);
	}

	@Override
		public void run(String... args) throws Exception {
		System.out.println("hello o dollar est combien aujourdhui");

		var consumapi = new ConsoumirApi();

		var response = consumapi.getData("https://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=XOF");
		System.out.println(response);
	}
}
