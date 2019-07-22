package com.mesdra.SpringProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesdra.SpringProject.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
