package br.com.ambientinformatica.blindbook.util;

import br.com.ambientinformatica.blindbook.entidade.Autor;
import br.com.ambientinformatica.blindbook.entidade.Editora;
import br.com.ambientinformatica.blindbook.persistencia.AutorDaoJpa;
import br.com.ambientinformatica.blindbook.persistencia.EditoraDaoJpa;
import br.com.ambientinformatica.jpa.exception.PersistenciaException;



public class MegaTeste {


public static void main(String[] args) {
	
	try {


		Editora editora = new Editora();
		editora.setNome("ABRIL" );
		
		EditoraDaoJpa jpa = new EditoraDaoJpa();
		
		jpa.incluir(editora);
	} catch (PersistenciaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}	
	
	

}
