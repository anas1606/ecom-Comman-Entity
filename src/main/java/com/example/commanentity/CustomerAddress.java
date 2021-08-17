package com.example.commanentity;

import lombok.Data;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class CustomerAddress {
    @Id
    private String addressuid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer customeruid;

    private String address1;
    private String address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State")
    private State state;

    private int pincode;

    public CustomerAddress(){
        this.addressuid = UUID.randomUUID().toString();
    }
}
