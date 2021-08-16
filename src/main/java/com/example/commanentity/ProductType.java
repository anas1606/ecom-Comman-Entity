package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ProductType extends AbstractDomain {
    @Id
    private String type;

    public ProductType() {
        this.setStatus(Status.ACTIVE);
    }
}
