package com.isai.demoinyecciondepencias.app.models;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//cloneable es indicar que permite la clonacion de sus objetos
public class Product implements Cloneable {
    private Long idProduct;
    private String nameProduct;
    private BigDecimal priceProduct;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(idProduct, nameProduct, priceProduct);
        }
    }
}
