package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Cidade;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("cidadeDao")
public class CidadeDaoJpa extends PersistenciaJpa<Cidade> implements CidadeDao{

   private static final long serialVersionUID = 1L;

}
