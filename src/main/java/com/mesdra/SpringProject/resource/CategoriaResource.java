package com.mesdra.SpringProject.resource;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mesdra.SpringProject.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(2,"Direito");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat);
		lista.add(cat2);
		
		return lista;
	}

}
