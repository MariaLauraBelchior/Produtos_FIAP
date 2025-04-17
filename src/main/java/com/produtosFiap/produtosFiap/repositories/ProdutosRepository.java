package com.produtosFiap.produtosFiap.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtosFiap.produtosFiap.models.Categoria;
import com.produtosFiap.produtosFiap.models.Produtos;





public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
    Optional<Produtos> findByCategoria(Categoria categoria);

    Optional<Produtos> findById(Long id);
}

