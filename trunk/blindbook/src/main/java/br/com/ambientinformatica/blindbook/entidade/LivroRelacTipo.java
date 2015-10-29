package br.com.ambientinformatica.blindbook.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LivroRelacTipo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorLivroRelacTipo")
	@SequenceGenerator(name = "geradorLivroRelacTipo", sequenceName = "gerador_livroRelacTipo", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	private int qtdEstoque;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	

}
