package br.com.ulteriorti.api.ulsis.services;


import br.com.ulteriorti.api.ulsis.models.City;
import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.State;
import br.com.ulteriorti.api.ulsis.repositories.CityRepository;
import br.com.ulteriorti.api.ulsis.repositories.CustomerRepository;
import br.com.ulteriorti.api.ulsis.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CityRepository cidadeRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(UUID id) {
        return  customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        City city = customer.getCidade();
        State estado = customer.getCidade().getEstado();
        estadoRepository.save(estado);
        city.setEstado(estado);
        cidadeRepository.save(city);
        customerRepository.save(customer);
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(UUID id, Customer customer) {
        Customer existingCustomer = (Customer) customerRepository.findById(id);
        if (existingCustomer != null) {
            existingCustomer.setNomeRazaoSocial(customer.getNomeRazaoSocial());
            existingCustomer.setEndereco(customer.getEndereco());
            existingCustomer.setContato(customer.getContato());
            existingCustomer.setCelular(customer.getCelular());
            existingCustomer.setTelefone(customer.getTelefone());
            existingCustomer.setCidade(customer.getCidade());
            existingCustomer.setCodigoPostal(customer.getCodigoPostal());
            existingCustomer.setIdentificador(customer.getIdentificador());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setSenha(customer.getSenha());
            return customerRepository.save(existingCustomer);
        }
        return null;
    }
    @Transactional
    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }
}
