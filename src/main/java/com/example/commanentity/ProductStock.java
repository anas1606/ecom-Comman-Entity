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
    private String stockuid;
    private int qty;

    public ProductStock() {
        this.stockuid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
