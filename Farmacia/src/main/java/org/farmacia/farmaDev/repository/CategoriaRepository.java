package org.farmacia.farmaDev.repository;

import java.util.List;

import org.farmacia.farmaDev.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
