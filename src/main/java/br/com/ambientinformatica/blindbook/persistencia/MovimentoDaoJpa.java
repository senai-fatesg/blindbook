package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Movimento;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("movimentoDao")
public class MovimentoDaoJpa extends PersistenciaJpa<Movimento> implements MovimentoDao{

   private static final long serialVersionUID = 1L;

}
