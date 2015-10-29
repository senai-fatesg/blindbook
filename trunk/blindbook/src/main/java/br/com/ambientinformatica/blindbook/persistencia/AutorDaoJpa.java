package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Autor;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("autorDao")
public class AutorDaoJpa extends PersistenciaJpa<Autor> implements AutorDao{

   private static final long serialVersionUID = 1L;

}
