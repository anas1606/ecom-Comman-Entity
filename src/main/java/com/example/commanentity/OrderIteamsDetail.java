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
    @JoinColumn(name = "OrderDetail")
    private OrderDetail fk_order_id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Product")
    private Product fk_product_id;

    private int qty;
    public OrderIteamsDetail() {
        this.id = UUID.randomUUID().toString();
    }
}
