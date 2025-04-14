package com.isai.demoinyecciondepencias.app.repositories;

import com.isai.demoinyecciondepencias.app.models.Product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImplementation implements ProductRepository {
    List<Product> products;

    public ProductRepositoryImplementation() {
        this.products = Arrays.asList(
                new Product(4L, "Smartphone Samsung Galaxy S23 Ultra", new BigDecimal("4500.50")),
                new Product(5L, "Apple Watch Series 8", new BigDecimal("1800.75")),
                new Product(6L, "Auriculares Sony WH-1000XM5", new BigDecimal("1250.99")),
                new Product(7L, "Tablet Apple iPad Pro 12.9-inch", new BigDecimal("3800.00")),
                new Product(8L, "Laptop Dell XPS 13", new BigDecimal("5200.25")),
                new Product(9L, "Consola PlayStation 5", new BigDecimal("2500.00")),
                new Product(10L, "Smart TV LG OLED 65-inch", new BigDecimal("6800.90")),
                new Product(11L, "Google Chromecast with Google TV", new BigDecimal("250.50")),
                new Product(12L, "Altavoz Inteligente Amazon Echo (4th Gen)", new BigDecimal("350.75")),
                new Product(13L, "Cámara de Seguridad Ring Stick Up Cam Battery", new BigDecimal("400.00")),
                new Product(14L, "Gafas de Realidad Virtual Meta Quest 2", new BigDecimal("1600.20")),
                new Product(15L, "Drone DJI Mavic 3", new BigDecimal("9500.80")),
                new Product(16L, "Impresora 3D Creality Ender 3 V2", new BigDecimal("1100.40")),
                new Product(17L, "Proyector Portátil Anker Nebula Capsule II", new BigDecimal("1400.60")),
                new Product(18L, "SSD Externo Samsung T7 1TB", new BigDecimal("600.30")),
                new Product(19L, "Funda Protectora OtterBox para iPhone 14 Pro Max", new BigDecimal("150.99")),
                new Product(20L, "Teclado Inalámbrico Logitech MX Keys", new BigDecimal("450.00")),
                new Product(21L, "Foco Inteligente Philips Hue White and Color Ambiance", new BigDecimal("180.50")),
                new Product(22L, "Barra de Sonido Bose Soundbar 900", new BigDecimal("3200.75")),
                new Product(23L, "E-reader Kindle Paperwhite (11th Generation)", new BigDecimal("500.00"))
        );
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public Product getProduct(Long id) {
        return this.products
                .stream()
                .filter(product -> product.getIdProduct().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
