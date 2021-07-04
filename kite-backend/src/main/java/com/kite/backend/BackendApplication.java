package com.kite.backend;

import com.kite.backend.model.Subject;
import com.kite.backend.service.SubjectService;
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
	CommandLineRunner createInitSubjects(SubjectService subjectService){
		return (args) ->{
			for(int i=1;i<=500;i++){
				Subject subject=new Subject();
				subject.setName("subject-" + i);
				subjectService.save(subject);
			}
		};
	}

}
