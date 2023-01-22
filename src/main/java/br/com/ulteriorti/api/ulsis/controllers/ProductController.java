package br.com.ulteriorti.api.ulsis.controllers;

import br.com.ulteriorti.api.ulsis.models.ProductModel;
import br.com.ulteriorti.api.ulsis.models.ServiceModel;
import br.com.ulteriorti.api.ulsis.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductModel> getAllProductModel() {
        return productService.getAllProductModel();
    }
    @PostMapping
    public ProductModel createService(@RequestBody ProductModel product) {
        return productService.createProductModel(product);
    }

    @PutMapping("/{id}")
    public ProductModel updateProductModel(@PathVariable UUID id,@RequestBody ProductModel product) {
        return productService.updateProductModel(id,product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductModel(@PathVariable UUID id) {
        productService.deleteProductModel(id);
    }

}