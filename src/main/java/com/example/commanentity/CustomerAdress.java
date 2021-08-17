package com.example.commanentity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CustomerAdress {
    @Id
    private String addresUID;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer")
    private Customer customerUID;

    private String address1;
    private String address2;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Country")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State")
    private State state;

    private int pincode;
}
