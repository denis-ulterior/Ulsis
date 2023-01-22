package br.com.ulteriorti.api.ulsis.repositories;


import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.Equipment;
import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceModel, UUID> {
    public ServiceModel findByName(String name);
    public ServiceModel findByDescricao(String descricao);

}