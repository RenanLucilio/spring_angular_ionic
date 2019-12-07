package com.renan.cursomc.repositories;

import com.renan.cursomc.domain.Categoria;
import com.renan.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Integer>{
}
