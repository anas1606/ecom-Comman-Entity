package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class ProductType extends AbstractDomain {
    @Id
    private String categoryuid;
    private String category;

    public ProductType() {
        this.categoryuid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
