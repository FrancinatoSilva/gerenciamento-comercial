package com.devnato.gerenciamentocomercial.infrastructure.repositorys;

import com.devnato.gerenciamentocomercial.infrastructure.entitys.Produto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer>{

    Optional<Produto> findBySku(String sku);

    @Transactional
    void deleteBySku(String sku);


}
