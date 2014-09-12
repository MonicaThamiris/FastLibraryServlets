package br.com.fastlibrary.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fastlibrary.enums.Sexo;

@NamedQuery(name="Autor.buscarPorNome",query="from Autor a where a.nome = :nome")
@Entity
@Table(name="FTL_AUTOR")
@SequenceGenerator(name="autorSeq",sequenceName="SEQ_AUTOR",allocationSize=1)
public class Autor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="autorSeq")
	@Column(name="AUTOR_ID")
	private int id;
	
	@Column(name="NOME",nullable=false,length=300)
	private String nome;
	
	@Column(name="SEXO",nullable=false)
	private Sexo sexo;
	
	@Column(name="SOBRENOME",nullable=false,length=300)
	private String sobrenome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	
	public Autor(String nome, Sexo sexo, String sobrenome,
			Calendar dtNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 300) {
			throw new IllegalArgumentException("O nome pode ter no máximo 300 caracteres");
		}
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() > 300) {
			throw new IllegalArgumentException("O sobrenome pode ter no máximo 300 caracteres");
		}
		this.sobrenome = sobrenome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

}
