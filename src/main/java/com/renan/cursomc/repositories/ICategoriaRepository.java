package com.renan.cursomc.repositories;

import com.renan.cursomc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{
}
