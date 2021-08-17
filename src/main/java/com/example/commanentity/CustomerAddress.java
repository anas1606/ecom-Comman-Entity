package com.example.commanentity;

import lombok.Data;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class CustomerAddress {
    @Id
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer fk_customer_id;

    private String address1;
    private String address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country")
    private Country fk_country_id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State")
    private State fk_state_id;

    private int pincode;

    public CustomerAddress(){
        this.id = UUID.randomUUID().toString();
    }
}
