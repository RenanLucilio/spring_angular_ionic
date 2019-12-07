package com.renan.cursomc.repositories;

import com.renan.cursomc.domain.Categoria;
import com.renan.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer>{
}
