package br.com.ulteriorti.api.ulsis.repositories;


import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceModel, UUID> {
    public ServiceModel findByName(String name);
    public ServiceModel findByDataPrestacao(LocalDate dataPrestacao);
}