package com.kirasoft.quickgrades;

import com.kirasoft.quickgrades.users.dtos.Gender;
import com.kirasoft.quickgrades.users.model.User;
import com.kirasoft.quickgrades.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class QuickGradesApplication implements CommandLineRunner {

	private UserRepository userRepository;

	@Autowired
	public QuickGradesApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickGradesApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {
		User laurent = new User("ldamiba", "Laurent",
				"Wendkuuni", "Damiba","secret",
				"ldamiba@kirasoft.com","19-08-1986" , Gender.MALE);
		User hortense =	new User("hkouakou", "Hortense",
				"Marie","Kouakou","secret",
				"hkouakou@kirasoft.com","25-09-1982",Gender.FEMALE);
		User chris = new User("chriskabor", "Sidnooma",
				"Christian", "Kabore","secret",
				"chriskabor@kirasoft.com","19-11-1984",Gender.MALE);

		userRepository.save(laurent);
		userRepository.save(hortense);
		userRepository.save(chris);
	}
}
