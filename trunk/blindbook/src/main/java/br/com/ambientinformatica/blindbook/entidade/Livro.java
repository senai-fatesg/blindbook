package br.com.ambientinformatica.blindbook.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorLivro")
	@SequenceGenerator(name = "geradorLivro", sequenceName = "gerador_livro", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	@ManyToOne
	private Autor autor;


	@ManyToOne
	private Editora editora;
	
	private String isbn;
	private String titulo;
	private String resumo;
	private int qtdPagina;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public int getQtdPagina() {
		return qtdPagina;
	}
	public void setQtdPagina(int qtdPagina) {
		this.qtdPagina = qtdPagina;
	}
	
	
	
	

}
