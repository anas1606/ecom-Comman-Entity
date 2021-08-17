package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class OrderIteamsDetail {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_order_id")
    private OrderDetail order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_product_id")
    private Product product;

    private int qty;
    public OrderIteamsDetail() {
        this.id = UUID.randomUUID().toString();
    }
}
