package org.indra.proyectomiguel.repositories;

import org.indra.proyectomiguel.models.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Integer> {

}
