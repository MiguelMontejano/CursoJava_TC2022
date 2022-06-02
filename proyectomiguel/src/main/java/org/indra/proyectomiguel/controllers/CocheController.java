package org.indra.proyectomiguel.controllers;

import java.util.List;

import org.indra.proyectomiguel.models.Coche;
import org.indra.proyectomiguel.services.ICocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	
	@Autowired
	private ICocheService service;
	
	@GetMapping("/api/coche")
	public ResponseEntity<List<Coche>> getAll() {
		return new ResponseEntity<List<Coche>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/api/coche/{id}")
	public ResponseEntity<Object> getById(@PathVariable int id) {
		try {
			return new ResponseEntity<Object>(this.service.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/api/coche")
	public ResponseEntity<Object> add(@RequestBody Coche coche) {
		
		//coche.setId(this.service.getAll().size() + 1);
		
		try {
			return new ResponseEntity<Object>(this.service.add(coche), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/api/coche/{id}")
	public ResponseEntity<Object> delete(@PathVariable int id) {
		try {
			return new ResponseEntity<Object>(this.service.delete(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
}
