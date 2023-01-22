package br.com.ulteriorti.api.ulsis.services;


import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.Equipment;
import br.com.ulteriorti.api.ulsis.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;

    public Equipment createEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
    public Equipment updateEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }
    public Equipment findByName(String name) {
        return equipmentRepository.findByName(name);
    }
    public Equipment findByCustomer(Customer customer) {
        return equipmentRepository.findByCustomer(customer);
    }
}