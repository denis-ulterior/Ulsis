package br.com.ulteriorti.api.ulsis.controllers;

import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import br.com.ulteriorti.api.ulsis.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @PostMapping
    public ServiceModel createService(@RequestBody ServiceModel service) {
        return serviceService.createService(service);
    }

    @PutMapping
    public ServiceModel updateService(@RequestBody ServiceModel service) {
        return serviceService.updateService(service);
    }

}