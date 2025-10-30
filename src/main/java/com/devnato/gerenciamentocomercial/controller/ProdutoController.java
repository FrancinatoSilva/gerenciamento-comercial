package com.devnato.gerenciamentocomercial.controller;

import com.devnato.gerenciamentocomercial.business.ProdutoService;
import com.devnato.gerenciamentocomercial.infrastructure.entitys.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Void> salvarProduto(@RequestBody Produto produto) {
        produtoService.salvarProduto(produto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Produto> buscarProdutoPorSku(@RequestParam String sku) {
        return ResponseEntity.ok().body(produtoService.buscarProdutoPorSku(sku));
    }

    @PutMapping
    public ResponseEntity<Void> atualizarProduto(@RequestParam String sku, @RequestBody Produto produto) {
        produtoService.atualizarProduto(sku, produto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarProduto(@RequestParam String sku) {
        produtoService.deletarProdutoPorSku(sku);
        return ResponseEntity.ok().build();
    }
}
