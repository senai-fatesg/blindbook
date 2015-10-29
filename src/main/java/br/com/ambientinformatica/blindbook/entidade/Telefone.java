package br.com.ambientinformatica.blindbook.entidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;


@Entity
public class Telefone {

	@Enumerated(EnumType.STRING)
	private EnumTelefoneTipo telefoneTipo;

	@ManyToOne
	private Pessoa pessoa;

	private String numero;
	private String contato;
	public EnumTelefoneTipo getTelefoneTipo() {
		return telefoneTipo;
	}
	public void setTelefoneTipo(EnumTelefoneTipo telefoneTipo) {
		this.telefoneTipo = telefoneTipo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	

}
