package com.isai.demoinyecciondepencias.app.services;


import com.isai.demoinyecciondepencias.app.models.Product;
import com.isai.demoinyecciondepencias.app.repositories.ProductRepositoryImplementation;

import java.util.List;

public class ServiceProductImplementation implements ProductService {

    private ProductRepositoryImplementation productRepositoryImplementation = new ProductRepositoryImplementation();

    @Override
    public List<Product> getProducts() {
        return productRepositoryImplementation.getProducts();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepositoryImplementation.getProduct(id);
    }
}
