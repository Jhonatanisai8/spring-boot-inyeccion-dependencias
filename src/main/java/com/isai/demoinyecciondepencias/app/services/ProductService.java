package com.isai.demoinyecciondepencias.app.services;

import com.isai.demoinyecciondepencias.app.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProduct(Long id);
}
