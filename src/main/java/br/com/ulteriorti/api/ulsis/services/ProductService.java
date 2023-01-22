package br.com.ulteriorti.api.ulsis.services;


import br.com.ulteriorti.api.ulsis.models.City;
import br.com.ulteriorti.api.ulsis.models.Customer;
import br.com.ulteriorti.api.ulsis.models.ProductModel;
import br.com.ulteriorti.api.ulsis.models.State;
import br.com.ulteriorti.api.ulsis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository  productRepository;


    public List<ProductModel> getAllProductModel() {
        return productRepository.findAll();
    }

    public Optional<ProductModel> getProductModelById(UUID id) {
        return  productRepository.findById(id);
    }

    public ProductModel createProductModel(ProductModel product) {
        productRepository.save(product);
        return productRepository.save(product);
    }

    public ProductModel updateProductModel(UUID id, ProductModel product) {
       ProductModel existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct  != null) {
            existingProduct.setDescricao(product.getDescricao());
            existingProduct.setNome(product.getNome());
            existingProduct.setGarantiaEmDias(product.getGarantiaEmDias());
            existingProduct.setValorVenda(product.getValorVenda());
            existingProduct.setValorCusto(product.getValorCusto());
            return productRepository.save(existingProduct);
        }
        return null;
    }
    public void deleteProductModel(UUID id) {
        productRepository.deleteById(id);
    }

}
