package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class ProductStock extends AbstractDomain {
    @Id
    private String stockUID;
    private int qty;

    public ProductStock() {
        this.stockUID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
