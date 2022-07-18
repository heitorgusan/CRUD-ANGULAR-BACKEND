package com.cursos.crud.cursos_crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cursos.crud.cursos_crud.model.Course;
import com.cursos.crud.cursos_crud.repository.CourseRepository;

@SpringBootApplication
public class CursosCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosCrudApplication.class, args);
	}

	@Bean //O Spring gerenciará todo o ciclo de vida etc..
	//Assim que iniciar a aplicação como exemplo vamos inserir alguns itens no db
	CommandLineRunner initDB(CourseRepository courseRepo) {
		return args->{
			courseRepo.deleteAll();
			Course c = new Course();
			c.setName("Santa Catarina");
			c.setCategory("Viagens");
			courseRepo.save(c);
		};
	}
}
