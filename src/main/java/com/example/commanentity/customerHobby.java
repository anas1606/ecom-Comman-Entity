package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "customer_hobby")
public class customerHobby {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer customer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_hobby_id")
    private Hobby hobby;

    public customerHobby() {
        this.id = UUID.randomUUID().toString();
    }
}
