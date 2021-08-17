package com.example.commanentity;


import com.example.commanentity.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class OrderIteam extends AbstractDomain {
    @Id
    private String orderIteamID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Order")
    private Order orderID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Product")
    private Product productUID;

    public OrderIteam() {
        this.orderIteamID = UUID.randomUUID().toString();
        this.setStatus(Status.ACTIVE);
    }
}
