package com.produtosFiap.produtosFiap.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.produtosFiap.produtosFiap.models.Categoria;

public record ProdutosDTO( String nome, BigDecimal preco, LocalDateTime dataCadastro, String descricao, Categoria categoria) {
    
}
