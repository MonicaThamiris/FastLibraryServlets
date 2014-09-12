package br.com.fastlibrary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FTL_EDITORA")
@SequenceGenerator(name="editoraSeq", sequenceName="SEQ_EDITORA",allocationSize=1)
public class Editora implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="editoraSeq")
	@Column(name="EDITORA_ID")
	private int id;
	
	@Column(name="CNPJ",nullable=false,length=100)
	private String cnpj;
	
	@Column(name="NOME",nullable=false,length=300)
	private String nome;
	
	@Column(name="ENDERECO",length=400)
	private String endereco;
	
	public Editora() {
		// TODO Auto-generated constructor stub
	}

	public Editora(String cnpj, String nome, String endereco) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() > 100) {
			throw new IllegalArgumentException("O CNPJ pode ter no máximo 100 caracteres");
		}
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 100) {
			throw new IllegalArgumentException("O nome pode ter no máximo 300 caracteres");
		}
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 100) {
			throw new IllegalArgumentException("O endereço pode ter no máximo 400 caracteres");
		}
		this.endereco = endereco;
	}
	
}
