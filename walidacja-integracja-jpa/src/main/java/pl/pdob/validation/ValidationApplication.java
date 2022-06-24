package pl.pdob.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ValidationApplication.class, args);
		ClientService clientService = ctx.getBean(ClientService.class);
		Client client = new Client("Jan", "Kowalski", "kowaljan@abc.com", 10);
//		Client client = new Client("Jan", "Kowalski", "kowaljan@abc.com", -10);
		try {
			clientService.register(client);
			System.out.println("Rejestracja powiodła się: " + client);
		} catch(DataIntegrityViolationException dive) {
			System.out.printf("Rejestracja nie powiodła się %s\n", client);
			System.out.println(dive.getMessage());
		}
	}

}