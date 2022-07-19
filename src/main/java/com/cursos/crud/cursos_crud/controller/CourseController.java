package com.cursos.crud.cursos_crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping
	@ResponseStatus(code= HttpStatus.CREATED)
	public Course create(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	//public ResponseEntity<Course>create(@RequestBody Course course){
		//return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
	//}
	
}
