package br.com.fastlibrary.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Brunospy
 *
 */
@NamedQuery(name="Usuario.buscarPorNomeESobrenome",query="from Usuario u where u.nome = :nome and u.sobrenome = :sobrenome")
@Entity
@Table(name="FTL_USUARIO")
@SequenceGenerator(name="usuarioSeq",sequenceName="SEQ_USUARIO",allocationSize=1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuarioSeq")
	private int id;
	
	@Column(name="NOME",nullable=false,length=300)
	private String nome;
	
	@Column(name="SOBRENOME",length=300)
	private String sobrenome;
	
	@Column(name="CPF",nullable=false,length=20)
	private String cpf;
	
	@Column(name="LOGIN",nullable=false)
	private String login;
	
	@Column(name="SENHA",nullable=false)
	private String senha;
	
	@Column(name="EMAIL",nullable=false)
	private String email;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() > 300) {
			throw new IllegalArgumentException("O sobrenome pode ter no máximo 300 caracteres");
		}
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() > 300) {
			throw new IllegalArgumentException("O cpf pode ter no máximo 20 caracteres");
		}
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
