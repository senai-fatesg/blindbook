package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("livroRelacTipoDao")
public class LivroRelacTipoDaoJpa extends PersistenciaJpa<LivroRelacTipoDao> implements LivroRelacTipoDao{

   private static final long serialVersionUID = 1L;

}
