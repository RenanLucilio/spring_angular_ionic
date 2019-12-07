package com.renan.cursomc.repositories;

import com.renan.cursomc.domain.Cliente;
import com.renan.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, Integer>{
}
