package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class OrderIteamsDetail {
    @Id
    private String OrderIteamsDetailid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderDetail")
    private OrderDetail orderid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Product")
    private Product productuid;

    private int qty;
    public OrderIteamsDetail() {
        this.OrderIteamsDetailid = UUID.randomUUID().toString();
    }
}
