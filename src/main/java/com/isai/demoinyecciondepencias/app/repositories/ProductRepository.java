package com.isai.demoinyecciondepencias.app.repositories;

import com.isai.demoinyecciondepencias.app.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();

    Product getProduct(Long id);
}
