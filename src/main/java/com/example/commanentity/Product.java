package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Product extends AbstractDomain {
    @Id
    private String productUID;
    private String productName;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductType")
    private ProductType productType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductStock")
    private ProductStock productStock;

    public Product() {
        this.productUID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
