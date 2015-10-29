package br.com.ambientinformatica.blindbook.entidade;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Movimento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorMovimento")
	@SequenceGenerator(name = "geradorMovimento", sequenceName = "gerador_movimento", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Funcionario funcionario;

	public Movimento() {
		
		cliente = new Cliente();
		funcionario = new Funcionario();

	}

	private String nome;
	private Date dataReserva;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

}
