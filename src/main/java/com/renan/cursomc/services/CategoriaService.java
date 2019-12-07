package com.renan.cursomc.services;

import com.renan.cursomc.domain.Categoria;
import com.renan.cursomc.repositories.ICategoriaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private ICategoriaRepository repo;

    public Categoria buscar(Integer id) throws ObjectNotFoundException {
        Optional<Categoria> categoria = repo.findById(id);

        return categoria.orElseThrow(() -> new ObjectNotFoundException(null , "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
