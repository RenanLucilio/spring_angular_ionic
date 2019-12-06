package com.renan.cursomc.resource;

import com.renan.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria("Informática");
        Categoria cat2 = new Categoria("Escritório");

        List<Categoria> categoriaList = new ArrayList<Categoria>();

        categoriaList.add(cat1);
        categoriaList.add(cat2);

        return categoriaList;
    }
}

