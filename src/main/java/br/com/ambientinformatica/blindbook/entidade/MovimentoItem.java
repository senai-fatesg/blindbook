package br.com.ambientinformatica.blindbook.entidade;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class MovimentoItem {


	private int sequenciaItem;
	
	@ManyToOne
	private Movimento movimento;
	
	@ManyToOne
	private Livro livro;
	

	@ManyToOne
	private Funcionario funcionario;

	public MovimentoItem() {

		funcionario = new Funcionario();
	}

	private float valorLancamento ;
	private Date dataEmissao;
	private Date dataBaixa ;
	private float valorBaixado ;


	
	public int getSequenciaItem() {
		return sequenciaItem;
	}
	public void setSequenciaItem(int sequenciaItem) {
		this.sequenciaItem = sequenciaItem;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public float getValorLancamento() {
		return valorLancamento;
	}
	public void setValorLancamento(float valorLancamento) {
		this.valorLancamento = valorLancamento;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	public float getValorBaixado() {
		return valorBaixado;
	}
	public void setValorBaixado(float valorBaixado) {
		this.valorBaixado = valorBaixado;
	}
	
	
	
	
	
	
}
