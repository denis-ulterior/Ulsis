package br.com.ulteriorti.api.ulsis.controllers;

import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import br.com.ulteriorti.api.ulsis.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @PostMapping
    public ServiceModel createService(@RequestBody ServiceModel service) {
        return serviceService.createService(service);
    }

    @PutMapping("/{id}")
    public ServiceModel updateService(@PathVariable UUID id,@RequestBody ServiceModel service) {
        return serviceService.updateService(id,service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable UUID id) {
        serviceService.deleteService(id);
    }

}