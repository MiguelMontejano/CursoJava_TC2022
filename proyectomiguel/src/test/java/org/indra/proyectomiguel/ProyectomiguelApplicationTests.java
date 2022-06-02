package org.indra.proyectomiguel;

import java.util.List;

import org.indra.proyectomiguel.models.Coche;
import org.indra.proyectomiguel.repositories.CocheRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectomiguelApplicationTests {

	@Autowired
	CocheRepository repo;
	
	@Test
	public void testGetAll() {
		List<Coche> todos = repo.findAll();
	}

}
