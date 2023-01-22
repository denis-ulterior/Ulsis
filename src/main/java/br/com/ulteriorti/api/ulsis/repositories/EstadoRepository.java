package br.com.ulteriorti.api.ulsis.repositories;

import br.com.ulteriorti.api.ulsis.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<State,Long> {

}
