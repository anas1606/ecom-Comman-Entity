package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Vendor_Product {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vendor_id")
    private Vendor vendor;

    public Vendor_Product() {
        this.id = UUID.randomUUID().toString();
    }
}
