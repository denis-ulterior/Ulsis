package br.com.ulteriorti.api.ulsis.services;

import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.Equipment;
import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import br.com.ulteriorti.api.ulsis.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceModel createService(ServiceModel service) {
        return serviceRepository.save(service);
    }

    public ServiceModel updateService(UUID id, ServiceModel service) {
        return serviceRepository.save(service);
    }


    public List<ServiceModel> findAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceModel findServiceById(UUID id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public List<ServiceModel> findServicesByDescricao(String descricao) {
        return (List<ServiceModel>) serviceRepository.findByDescricao(descricao);
    }

    public void deleteService(UUID id){serviceRepository.deleteById(id);};

    public List<ServiceModel> getAllServiceModel() {
        return (List<ServiceModel>)serviceRepository.findAll() ;
    }
}
