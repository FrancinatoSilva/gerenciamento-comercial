package com.devnato.gerenciamentocomercial.infrastructure.repositorys;

import com.devnato.gerenciamentocomercial.infrastructure.entitys.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
