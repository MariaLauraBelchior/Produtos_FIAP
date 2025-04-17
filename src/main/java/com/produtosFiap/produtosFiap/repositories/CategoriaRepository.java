package com.produtosFiap.produtosFiap.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtosFiap.produtosFiap.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    Optional<Categoria> findById(Long id);
}
