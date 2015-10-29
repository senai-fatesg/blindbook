package br.com.ambientinformatica.blindbook.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "geradorCidade")
	@SequenceGenerator(name="geradorCidade", sequenceName = "gerador_cidade", allocationSize=1, initialValue=1)
	private Integer id = 0;

	private String nome;

	@Enumerated(EnumType.STRING)
	private EnumUF uf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return nome;
	}

	public void setDescricao(String descricao) {
		this.nome = descricao;
	}

	public EnumUF getUf() {
		return uf;
	}

	public void setUf(EnumUF uf) {
		this.uf = uf;
	}
}
