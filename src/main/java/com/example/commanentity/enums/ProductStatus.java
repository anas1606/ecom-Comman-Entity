package com.example.commanentity.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProductStatus {
    INSTOCK(1),
    OUTOFSTOCK(0);

    private int stock;

    ProductStatus(int stock) {
        this.stock = stock;
    }
}
