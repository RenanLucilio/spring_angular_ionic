package com.renan.cursomc.services;

import com.renan.cursomc.domain.Categoria;
import com.renan.cursomc.repositories.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private ICategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> categoria = repo.findById(id);

        return categoria.orElse(null);
    }

    public Categoria Create(Categoria categoria){
        if (categoria != null)
            repo.save(categoria);

        return categoria;
    }

}
