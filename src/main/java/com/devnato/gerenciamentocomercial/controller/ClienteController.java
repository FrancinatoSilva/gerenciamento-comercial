package com.devnato.gerenciamentocomercial.controller;

import com.devnato.gerenciamentocomercial.business.ClienteService;
import com.devnato.gerenciamentocomercial.infrastructure.entitys.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> salvarCliente(@RequestBody Cliente cliente) {
        clienteService.salvarCliente(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Cliente> buscarClientePorId(@RequestParam Integer id) {
        return ResponseEntity.ok(clienteService.buscarClientePorId(id));
    }

    @PutMapping
    public ResponseEntity<Void> atualizarCliente(@RequestParam Integer id,@RequestBody Cliente cliente) {
        clienteService.atualizarCliente(id, cliente);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarCliente(@RequestParam Integer id) {
        clienteService.deletarClientePorId(id);
        return ResponseEntity.ok().build();
    }


}
