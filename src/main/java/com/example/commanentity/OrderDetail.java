package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class OrderDetail extends AbstractDomain {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_customer_id")
    private Customer customer;

    private int amount;
    private int total_qty;

    public OrderDetail() {
        this.id = UUID.randomUUID().toString();
    }
}
