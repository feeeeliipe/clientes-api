package br.com.felipe.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.felipe.clientesapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}
