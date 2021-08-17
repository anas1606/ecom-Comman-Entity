package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class OrderDetail extends AbstractDomain {
    @Id
    private String orderID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer customerUID;

    private int amount;
    private int qty;

    public OrderDetail() {
        this.orderID = UUID.randomUUID().toString();
    }
}
