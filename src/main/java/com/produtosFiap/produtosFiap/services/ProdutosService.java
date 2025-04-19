package com.produtosFiap.produtosFiap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtosFiap.produtosFiap.dtos.ProdutosDTO;
import com.produtosFiap.produtosFiap.models.Produtos;
import com.produtosFiap.produtosFiap.repositories.ProdutosRepository;

@Service
public class ProdutosService {
    
    @Autowired
    private ProdutosRepository produtosRepository;

    public Produtos findById(Long id) throws Exception {
        return this.produtosRepository.findById(id).orElseThrow(() -> new Exception("Identificação não encontrada"));
    }

    public Produtos cadastrarProdutos(ProdutosDTO produtosDTO) {
        Produtos novoProduto = new Produtos();
        novoProduto = produtosRepository.save(novoProduto);
        return novoProduto;
    }

    public List<Produtos> buscarProdutos() {
        return this.produtosRepository.findAll();
    }
}
