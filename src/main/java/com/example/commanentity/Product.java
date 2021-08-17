package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Product extends AbstractDomain {
    @Id
    private String productuid;
    private String productname;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductType")
    private ProductType producttype;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductStock")
    private ProductStock productstock;

    public Product() {
        this.productuid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
