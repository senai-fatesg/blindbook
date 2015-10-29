package br.com.ambientinformatica.blindbook.entidade;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Lancamento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorLancamento")
	@SequenceGenerator(name = "geradorLancamento", sequenceName = "gerador_lancamento", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	@ManyToOne
	private List<MovimentoItem> movimentoItens;

	@ManyToOne
	private Funcionario funcionario;

	
	@Enumerated(EnumType.STRING)
	private EnumLancamentoStatus lancamentoStatus;

	@Enumerated(EnumType.STRING)
	private EnumFormaPagamento formapagamento;

	
	public Lancamento() {

		funcionario = new Funcionario();
	}

	private float valorLancamento ;
	private Date dataEmissao;
	private Date dataBaixa ;
	private float valorBaixado ;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	public List<MovimentoItem> getMovimentoItens() {
		return movimentoItens;
	}
	public void setMovimentoItens(List<MovimentoItem> movimentoItens) {
		this.movimentoItens = movimentoItens;
	}
	public EnumLancamentoStatus getLancamentoStatus() {
		return lancamentoStatus;
	}
	public void setLancamentoStatus(EnumLancamentoStatus lancamentoStatus) {
		this.lancamentoStatus = lancamentoStatus;
	}
	public EnumFormaPagamento getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(EnumFormaPagamento formapagamento) {
		this.formapagamento = formapagamento;
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
