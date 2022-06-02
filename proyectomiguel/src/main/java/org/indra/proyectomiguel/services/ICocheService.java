package org.indra.proyectomiguel.services;

import java.util.List;

import org.indra.proyectomiguel.models.Coche;

public interface ICocheService {
	public List<Coche> getAll();
	public Coche getById(int id) throws Exception;
	public Coche add(Coche coche) throws Exception;
	public Coche delete(int id);
}
