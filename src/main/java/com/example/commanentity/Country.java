package com.example.commanentity;

import com.example.commanentity.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Country extends AbstractDomain {
    @Id
    private String id;
    private String name;

    public Country() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE.getStatus());
    }
}
