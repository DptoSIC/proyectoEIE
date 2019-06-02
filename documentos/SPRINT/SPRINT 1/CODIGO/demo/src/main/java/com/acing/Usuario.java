package com.acing;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Usuario {
	
	@Id 
	@GeneratedValue 
	int idUsuario;
	String nombreUsuario;
	Perfil tipoPerfil;

	
}
