package com.example.commanentity;

import com.example.commanentity.enums.ProductStatus;
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
    @Enumerated(EnumType.ORDINAL)
    private ProductStatus productStatus;

    public Product() {
        this.productUID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
        this.productStatus = ProductStatus.INSTOCK;
    }
}
