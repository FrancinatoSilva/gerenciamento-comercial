package com.devnato.gerenciamentocomercial.business;

import com.devnato.gerenciamentocomercial.infrastructure.entitys.Cliente;
import com.devnato.gerenciamentocomercial.infrastructure.repositorys.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvarCliente(Cliente cliente) {
        clienteRepository.saveAndFlush(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id não encontrado"));
    }

    public void atualizarCliente(Integer id, Cliente cliente) {
        Cliente clienteEntity = clienteRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Cliente clienteAtualizado = Cliente.builder()
                .nome(cliente.getNome() != null ? cliente.getNome() :
                        clienteEntity.getNome())
                .email(cliente.getEmail() != null ? cliente.getEmail() :
                        clienteEntity.getEmail())
                .id(clienteEntity.getId())
                .build();

        clienteRepository.saveAndFlush(clienteAtualizado);
    }

    public void deletarClientePorId(Integer id) {
        clienteRepository.deleteById(id);
    }


}
