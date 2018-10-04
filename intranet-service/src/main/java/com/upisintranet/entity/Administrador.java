package com.upisintranet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador implements Serializable {

	private static final long serialVersionUID = 301211582301644423L;

	@Id
	@Column(name = "ID_ADMIN")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_admin;

	@NotBlank
	@Column(name = "NOME_ADMIN")
	private String nome;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "NASCIMENTO_ADMIN")
	private Date nascimento;

	@NotNull
	@Column(name = "POSITION")
	private String position;

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
