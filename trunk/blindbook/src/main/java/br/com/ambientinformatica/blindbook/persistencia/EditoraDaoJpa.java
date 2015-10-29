package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Editora;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("editoraDao")
public class EditoraDaoJpa extends PersistenciaJpa<Editora> implements EditoraDao{

   private static final long serialVersionUID = 1L;

}
