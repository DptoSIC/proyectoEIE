package com.acing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


	@RepositoryRestResource(path = "proyectos") 
	public interface proyectoDAO extends JpaRepository<Proyecto, Integer>{

	
}
