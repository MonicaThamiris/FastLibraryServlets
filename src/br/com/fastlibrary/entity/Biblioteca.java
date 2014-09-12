package br.com.fastlibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FTL_BIBLIOTECA")
@SequenceGenerator(name="bibliotecaSeq",sequenceName="SEQ_BIBLIOTECA",allocationSize=1)
public class Biblioteca {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bibliotecaSeq")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="nr_inscricao_estadual")
	private int incricaoEstadual;
	
	public Biblioteca(){}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getIncricaoEstadual() {
		return incricaoEstadual;
	}

	public void setIncricaoEstadual(int incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
