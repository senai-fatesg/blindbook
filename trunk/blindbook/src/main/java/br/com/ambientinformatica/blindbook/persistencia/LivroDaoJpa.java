package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Livro;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("livroDao")
public class LivroDaoJpa extends PersistenciaJpa<Livro> implements LivroDao{

   private static final long serialVersionUID = 1L;

}
