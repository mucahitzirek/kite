package com.kite.backend;

import com.kite.backend.model.Subject;
import com.kite.backend.model.User;
import com.kite.backend.service.SubjectService;
import com.kite.backend.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner createInitSubjects(SubjectService subjectService, UserService userService) {

		return (args) -> {
			for (int i = 1; i <= 500; i++) {

				Subject subject = new Subject();
				subject.setName("subject-" + i);
				subjectService.save(subject);

				User user = new User();
				user.setUsername("name-" + i);
				user.setFirstName("firstname-" + i);
				user.setLastName("lastname-" + i);
				user.setLastName("lastname-" + i);
				user.setEmail("email-" + i);
				user.setPassword("password-" + i);
				user.setAbout("about-" + i);
				userService.save(user);

			}
		};
	}

}
