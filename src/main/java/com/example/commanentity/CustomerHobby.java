package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class CustomerHobby {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer customer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_hobby_id")
    private Hobby hobby;

    public CustomerHobby() {
        this.id = UUID.randomUUID().toString();
    }
}
