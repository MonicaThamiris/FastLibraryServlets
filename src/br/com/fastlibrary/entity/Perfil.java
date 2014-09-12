package br.com.fastlibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FTL_PERFIL")
@SequenceGenerator(name = "perfilSeq", sequenceName = "SEQ_PERFIL", allocationSize = 1)
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfilSeq")
	private int id;

	@Column(name = "NOME_PERFIL", nullable = false)
	private String nome;

	public Perfil() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
