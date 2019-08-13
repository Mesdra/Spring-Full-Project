package com.mesdra.SpringProject.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mesdra.SpringProject.domain.Pedido;
import com.mesdra.SpringProject.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		
		Pedido ped = service.find(id);
		
		return ResponseEntity.ok().body(ped);
	}

}
