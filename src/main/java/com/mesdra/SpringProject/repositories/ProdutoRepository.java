package com.mesdra.SpringProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesdra.SpringProject.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
