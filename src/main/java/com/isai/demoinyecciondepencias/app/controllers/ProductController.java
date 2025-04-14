package com.isai.demoinyecciondepencias.app.controllers;

import com.isai.demoinyecciondepencias.app.models.Product;
import com.isai.demoinyecciondepencias.app.services.ServiceProduct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductController {

    private ServiceProduct serviceProduct = new ServiceProduct();


    @RequestMapping(path = "/getProducts", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return serviceProduct.getProducts();
    }

    @RequestMapping(path = "/getProducts/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable Long id) {
        return serviceProduct.getProduct(id);
    }
}
