package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class OrderIteamsDetail {
    @Id
    private String OrderIteamsDetailID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderDetail")
    private OrderDetail orderID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Product")
    private Product productUID;

    public OrderIteamsDetail() {
        this.OrderIteamsDetailID = UUID.randomUUID().toString();
    }
}
