package br.com.ulteriorti.api.ulsis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ulteriorti.api.ulsis.models.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    public City findByNomeAndEstado(String name, String estado);
}
