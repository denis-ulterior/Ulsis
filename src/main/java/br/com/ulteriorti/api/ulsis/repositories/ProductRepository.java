package br.com.ulteriorti.api.ulsis.repositories;


import br.com.ulteriorti.api.ulsis.models.ProductModel;
import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    public ServiceModel findByNome(String name);
    public ServiceModel findByDescricao(String descricao);
    void deleteById(UUID id);
}