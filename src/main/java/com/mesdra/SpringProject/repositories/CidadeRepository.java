package com.mesdra.SpringProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesdra.SpringProject.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
