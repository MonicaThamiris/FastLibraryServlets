package br.com.fastlibrary.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="Livro.buscarTodosLivros",query="from Livro"),
	@NamedQuery(name="Livro.buscarPorTitulo",query="from Livro l where l.titulo = :titulo"),
	@NamedQuery(name="Livro.buscarPorEditora",query="from Livro l where l.editora.nome = :editora"),
	@NamedQuery(name="Livro.mediaPrecoLivros",query="select avg(l.preco) from Livro l where l.editora.nome = :editora")
})
@Entity
@Table(name="FTL_LIVRO")
@SequenceGenerator(name="livroSeq",sequenceName="SEQ_LIVRO",allocationSize=1)
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="LIVRO_ISBN")
	private int isbn;
	
	@Column(name="TITULO",nullable=false,length=200)
	private String titulo;
	
	@Column(name="PRECO")
	private float preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_LANCAMENTO")
	private Calendar dtLancamento;
	
	@Column(name="CAPA")
	private Blob capa;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="EDITORA_ID")
	private Editora editora;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TB_AUTOR_LIVRO",joinColumns={@JoinColumn(name="LIVRO_ISBN")},inverseJoinColumns={@JoinColumn(name="AUTOR_ID")})
	private List<Autor> autores;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(int isbn, String titulo, float preco, Calendar dtLancamento,
			Blob capa, Editora editora, List<Autor> autores) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
		this.capa = capa;
		this.editora = editora;
		this.autores = autores;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 200) {
			throw new IllegalArgumentException("O título pode ter no máximo 200 caracteres");
		}
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Calendar getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public Blob getCapa() {
		return capa;
	}

	public void setCapa(Blob capa) {
		this.capa = capa;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
}
