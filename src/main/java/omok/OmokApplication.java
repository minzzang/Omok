package omok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OmokApplication {

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		SpringApplication.run(OmokApplication.class, args);
	}

}
