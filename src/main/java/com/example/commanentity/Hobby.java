package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Hobby extends AbstractDomain {
    @Id
    private String id;
    private String name;

    public Hobby() {
        this.id = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
