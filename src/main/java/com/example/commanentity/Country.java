package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Country extends AbstractDomain {
    @Id
    private String countryuid;
    private String country;

    public Country() {
        this.countryuid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
