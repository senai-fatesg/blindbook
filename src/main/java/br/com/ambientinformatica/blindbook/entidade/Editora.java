package br.com.ambientinformatica.blindbook.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorEditora")
	@SequenceGenerator(name = "geradorEditora", sequenceName = "gerador_editora", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
