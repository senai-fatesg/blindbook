package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Lancamento;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("lancamentoDao")
public class LancamentoDaoJpa extends PersistenciaJpa<Lancamento> implements LancamentoDao{

   private static final long serialVersionUID = 1L;

}
