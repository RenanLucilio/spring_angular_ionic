package com.renan.cursomc.services;

import com.renan.cursomc.domain.Categoria;
import com.renan.cursomc.domain.Cliente;
import com.renan.cursomc.repositories.ICategoriaRepository;
import com.renan.cursomc.repositories.IClienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository repo;

    public Cliente buscar(Integer id) throws ObjectNotFoundException {
        Optional<Cliente> cliente = repo.findById(id);

        return cliente.orElseThrow(() -> new ObjectNotFoundException(null , "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
