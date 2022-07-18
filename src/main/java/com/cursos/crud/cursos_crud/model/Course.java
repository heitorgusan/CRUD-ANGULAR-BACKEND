package com.cursos.crud.cursos_crud.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity()
//@Table("cursos")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("_id") //Quando gerar um JSON ele converte de id  pra _id  o nome da propriedade
	//@JsonIgnore //Não envia o ID no JSON
	private Long id;
	
	@Column(name = "name", length = 200, nullable = false) //Fica implicito mas vc pode customizar
	private String name;
	@Column(name = "category", length = 20, nullable = false)
	private String category;
	
	
	
	public Course(Long id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	public Course() {
	
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", category=" + category + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(category, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
