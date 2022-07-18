package com.cursos.crud.cursos_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursos.crud.cursos_crud.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

}
