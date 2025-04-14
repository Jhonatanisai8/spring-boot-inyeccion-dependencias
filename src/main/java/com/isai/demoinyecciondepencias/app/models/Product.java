package com.isai.demoinyecciondepencias.app.models;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Long idProduct;
    private String nameProduct;
    private BigDecimal priceProduct;
}
