package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class OrderDetail extends AbstractDomain {
    @Id
    private String orderid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer customeruid;

    private int amount;
    private int totalqty;

    public OrderDetail() {
        this.orderid = UUID.randomUUID().toString();
    }
}
