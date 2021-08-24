package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class State extends AbstractDomain {
    @Id
    private String id;
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_country_id")
    private Country country;

    public State() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE.getStatus());
    }
}
