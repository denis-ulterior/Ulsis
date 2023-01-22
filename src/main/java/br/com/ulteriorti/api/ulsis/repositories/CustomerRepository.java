package br.com.ulteriorti.api.ulsis.repositories;

import br.com.ulteriorti.api.ulsis.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findById(UUID id);
    List<Customer> findByNomeRazaoSocial(String nomeRazaoSocial);
    List<Customer> findByTelefone(String telefone);
    List<Customer> findByCelular(String celular);
}
