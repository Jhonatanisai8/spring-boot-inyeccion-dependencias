package com.isai.demoinyecciondepencias.app.services;


import com.isai.demoinyecciondepencias.app.models.Product;
import com.isai.demoinyecciondepencias.app.repositories.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceProduct {

    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts()
                .stream().
                map(product -> {
                    product.setPriceProduct(product.getPriceProduct().multiply(new BigDecimal("1.50")));
                    return product;
                })
                .collect(Collectors.toList());
    }

    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }

}
