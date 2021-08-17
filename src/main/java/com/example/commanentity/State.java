package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class State extends AbstractDomain {
    @Id
    private String stateuid;
    private String state;

    public State() {
        this.stateuid = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
