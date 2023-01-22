package br.com.ulteriorti.api.ulsis.services;

import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import br.com.ulteriorti.api.ulsis.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceModel createService(ServiceModel service) {
        return serviceRepository.save(service);
    }
    public ServiceModel updateService(ServiceModel service) {
        return serviceRepository.save(service);
    }
    public ServiceModel findByName(String name) {
        return serviceRepository.findByName(name);
    }
    public ServiceModel findByDataPrestacao(LocalDate dataPrestacao) {
        return serviceRepository.findByDataPrestacao(dataPrestacao);
    }
}