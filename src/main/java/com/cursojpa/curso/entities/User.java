package com.cursojpa.curso.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String email;
	private String teleone;
	private String senha;
	
	public User() {
		
	}

	public User(long id, String nome, String email, String teleone, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.teleone = teleone;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeleone() {
		return teleone;
	}

	public void setTeleone(String teleone) {
		this.teleone = teleone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
	
}
