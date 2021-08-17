package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Product extends AbstractDomain {
    @Id
    private String id;

    private String name;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_producttype_id")
    private ProductType producttype;

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
