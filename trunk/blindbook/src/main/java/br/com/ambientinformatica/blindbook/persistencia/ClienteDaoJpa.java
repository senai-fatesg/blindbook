package br.com.ambientinformatica.blindbook.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.blindbook.entidade.Cliente;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("clienteDao")
public class ClienteDaoJpa extends PersistenciaJpa<Cliente> implements ClienteDao{

   private static final long serialVersionUID = 1L;

}
