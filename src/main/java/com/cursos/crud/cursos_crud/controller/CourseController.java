package com.cursos.crud.cursos_crud.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.crud.cursos_crud.model.Course;
import com.cursos.crud.cursos_crud.repository.CourseRepository;

@RestController
@RequestMapping("api/courses")
public class CourseController {

	
	private final CourseRepository courseRepository;
	
	//Injeção de independencia via constructor (melhor prática do momento de acordo com a loiane)
	public CourseController(CourseRepository courseRepo) {
		this.courseRepository = courseRepo;
	}
	
	@GetMapping
	public List<Course> list(){
		return this.courseRepository.findAll();
	}
	
}
