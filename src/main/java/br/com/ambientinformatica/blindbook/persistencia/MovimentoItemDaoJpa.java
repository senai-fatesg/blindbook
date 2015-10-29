package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.MovimentoItem;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("movimentoItemDao")
public class MovimentoItemDaoJpa extends PersistenciaJpa<MovimentoItem> implements MovimentoItemDao{

   private static final long serialVersionUID = 1L;

}
