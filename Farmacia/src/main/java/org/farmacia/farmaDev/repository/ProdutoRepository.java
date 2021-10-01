package org.farmacia.farmaDev.repository;

import java.util.List;

import org.farmacia.farmaDev.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

}
