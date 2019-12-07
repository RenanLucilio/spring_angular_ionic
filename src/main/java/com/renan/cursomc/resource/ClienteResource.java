package com.renan.cursomc.resource;

import com.renan.cursomc.domain.Cliente;
import com.renan.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity find(@PathVariable Integer id){
        Cliente cliente = clienteService.buscar(id);
        if (cliente == null) return ResponseEntity.badRequest().body(null);

        return ResponseEntity.ok(cliente);
    }
}
