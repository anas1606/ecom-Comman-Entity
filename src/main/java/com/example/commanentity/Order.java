package com.example.commanentity;

import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Order extends AbstractDomain {
    @Id
    private String orderID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer customerUID;

    private int amount;
    private int qty;

    public Order() {
        this.orderID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
