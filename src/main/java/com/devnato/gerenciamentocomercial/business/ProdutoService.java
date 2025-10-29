package com.devnato.gerenciamentocomercial.business;

import com.devnato.gerenciamentocomercial.infrastructure.entitys.Produto;
import com.devnato.gerenciamentocomercial.infrastructure.repositorys.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService (ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void salvarProduto (Produto produto) {
        produtoRepository.saveAndFlush(produto);

    }

    public Produto buscarProdutoPorSku (String sku) {

        return produtoRepository.findBySku(sku)
                .orElseThrow(() -> new RuntimeException("SKU não encontrado"));


    }

    public void deletarProdutoPorSku (String sku) {
        produtoRepository.deleteBySku(sku);
    }

    public void atualizarProduto (Integer id, Produto produto) {

        Produto produtoEntity = produtoRepository.findById(id).orElseThrow(() ->
            new RuntimeException("Usuario não encontrado"));
        Produto produtoAtualizado = Produto.builder()
                .nome(produto.getNome() != null ? produto.getNome() :
                        produtoEntity.getNome())
                .marca(produto.getMarca() != null ? produto.getMarca() :
                        produtoEntity.getMarca())
                .preco(produto.getPreco() != null ? produto.getPreco() :
                        produtoEntity.getPreco())
                .id(produtoEntity.getId())
                .sku(produtoEntity.getSku())
                .build();

    }



}
