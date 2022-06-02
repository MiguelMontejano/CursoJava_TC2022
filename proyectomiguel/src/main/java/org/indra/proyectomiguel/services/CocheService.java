package org.indra.proyectomiguel.services;

import java.util.List;

import org.indra.proyectomiguel.models.Coche;
import org.indra.proyectomiguel.repositories.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocheService implements ICocheService {
	
	@Autowired
	private CocheRepository repository;

	@Override
	public List<Coche> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Coche getById(int id) throws Exception {
		return this.repository.findById(id).get();
	}

	@Override
	public Coche add(Coche coche) throws Exception {
		if(coche.getMarca() == null || coche.getMarca().length() == 0) throw new Exception("Falta la marca del coche");
		if(coche.getModelo() == null || coche.getModelo().length() == 0) throw new Exception("Falta el modelo del coche");
		
		this.repository.save(coche);
		return coche;
	}

	@Override
	public Coche delete(int id) {
		Coche cocheEliminado = this.repository.findById(id).get();
		
		this.repository.deleteById(id);
		
		return cocheEliminado;
	}

}
