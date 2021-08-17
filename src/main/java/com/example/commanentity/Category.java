package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Category extends AbstractDomain {
    @Id
    private String id;

    private String name;

    public Category() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
